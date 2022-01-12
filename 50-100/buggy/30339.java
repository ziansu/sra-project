@java.lang.Override
public void onLocalVideoTrackReceive(com.quickblox.videochat.webrtc.QBRTCSession session, com.quickblox.videochat.webrtc.view.QBRTCVideoTrack videoTrack) {
    this.localVideoTrack = videoTrack;
    android.util.Log.d("Track", ("localVideoVidew is " + (localVideoVidew)));
    localVideoVidew = ((com.quickblox.videochat.webrtc.view.QBGLVideoView) (findViewById(R.id.localVideoVidew)));
    videoTrack.addRenderer(new org.webrtc.VideoRenderer(new com.quickblox.videochat.webrtc.view.VideoCallBacks(localVideoVidew, QBGLVideoView.Endpoint.LOCAL)));
    localVideoVidew.setVideoTrack(videoTrack, QBGLVideoView.Endpoint.LOCAL);
    android.util.Log.d("Track", "onLocalVideoTrackReceive() is raned");
}