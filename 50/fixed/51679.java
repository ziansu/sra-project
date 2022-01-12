@java.lang.Override
protected void onPause() {
    super.onPause();
    org.cocos2dx.lib.Cocos2dxHelper.onPause();
    mGLSurfaceView.onPause();
}