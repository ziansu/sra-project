public void acceptCall(android.view.View view) {
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
    }
    finish();
    startCallWithFlag(false);
    org.json.JSONObject message = new org.json.JSONObject();
    com.webrtc.core.WebRtcService.getInstance().emit(P2PSocket.ACCEPT_CALL, message);
}