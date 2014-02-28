package com.yxp.liveplayer;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends Activity {

	Button mButton; 
	VideoView videoView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mButton = (Button)findViewById(R.id.button);
		mButton.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PlayRtspStream();
			}
		});
		
		videoView = (VideoView)findViewById(R.id.videoView);
		}
	
	private void PlayRtspStream(){
		
		videoView.setVideoURI(Uri.parse("rtsp://218.204.223.237:554/live/1/66251FC11353191F/e7ooqwcfbqjoo80j.sdp"));
		videoView.requestFocus();
		videoView.start();
	}
}
