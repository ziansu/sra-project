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
    super.onDestroy();
}