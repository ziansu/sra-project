@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.DemoHelper.getInstance().isVideoCalling = false;
    stopMonitor();
    try {
        callHelper.setSurfaceView(null);
        cameraHelper.stopCapture();
        com.easemob.chatuidemo.ui.VideoCallActivity.oppositeSurface = null;
        cameraHelper = null;
    } catch (java.lang.Exception e) {
    }
}