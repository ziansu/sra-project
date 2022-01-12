@java.lang.Override
protected void onDestroy() {
    android.util.Log.d("CALL_INTEGRATION", "Destroy call activity");
    cancelPlayer();
    super.onDestroy();
    if (com.quickblox.videochat.webrtc.QBRTCClient.isInitiated()) {
        com.quickblox.videochat.webrtc.QBRTCClient.getInstance().close(true);
    }
    if ((videoChatHelper) != null) {
        videoChatHelper.setClientClosed();
    }
}