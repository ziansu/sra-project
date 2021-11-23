@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        org.cocos2dx.lib.Cocos2dxHelper.onResume();
        mGLSurfaceView.onResume();
    }else {
        org.cocos2dx.lib.Cocos2dxHelper.onPause();
        mGLSurfaceView.onPause();
    }
}