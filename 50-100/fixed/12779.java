@java.lang.Override
public void onLocalVideoTrackReceive(com.quickblox.videochat.webrtc.QBRTCSession session, com.quickblox.videochat.webrtc.view.QBRTCVideoTrack videoTrack) {
    localVideoVidew = ((com.quickblox.videochat.webrtc.view.QBGLVideoView) (findViewById(R.id.localVideoVidew)));
    android.util.Log.d("Track", ("localVideoVidew is " + (localVideoVidew)));
    if ((localVideoVidew) != null) {
        videoTrack.addRenderer(new org.webrtc.VideoRenderer(new com.quickblox.videochat.webrtc.view.VideoCallBacks(localVideoVidew, QBGLVideoView.Endpoint.LOCAL)));
        localVideoVidew.setVideoTrack(videoTrack, QBGLVideoView.Endpoint.LOCAL);
        android.util.Log.d("Track", "onLocalVideoTrackReceive() is raned");
    }
}