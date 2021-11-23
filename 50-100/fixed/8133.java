@java.lang.Override
public void onRemoteVideoTrackReceive(com.quickblox.videochat.webrtc.QBRTCSession session, com.quickblox.videochat.webrtc.view.QBRTCVideoTrack videoTrack, java.lang.Integer userID) {
    remoteVideoView = ((com.quickblox.videochat.webrtc.view.QBGLVideoView) (findViewById(R.id.remoteVideoView)));
    android.util.Log.d("Track", ("remoteVideoView is " + (remoteVideoView)));
    if ((remoteVideoView) != null) {
        org.webrtc.VideoRenderer remouteRenderer = new org.webrtc.VideoRenderer(new com.quickblox.videochat.webrtc.view.VideoCallBacks(remoteVideoView, QBGLVideoView.Endpoint.REMOTE));
        videoTrack.addRenderer(remouteRenderer);
        remoteVideoView.setVideoTrack(videoTrack, QBGLVideoView.Endpoint.REMOTE);
        android.util.Log.d("Track", "onRemoteVideoTrackReceive() is raned");
    }
}