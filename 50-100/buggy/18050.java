@java.lang.Override
protected void onDestroy() {
    client.disconnect();
    if ((localRenderer) != null) {
        localRenderer.release();
        localRenderer = null;
    }
    if ((remoteRenderer) != null) {
        remoteRenderer.release();
        remoteRenderer = null;
    }
    stopService(new android.content.Intent(this, kr.ac.jejunu.ncl.wifi_direct_webrtc.net.server.Server.class));
    super.onDestroy();
}