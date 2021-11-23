public synchronized boolean onTouchEvent(final android.view.MotionEvent e) {
    if (app.is_demo) {
        app.showDialog(0);
    }
    if (com.rtsoft.rt3dapp.AppGLSurfaceView.mMultiTouchClassAvailable) {
        return com.rtsoft.rt3dapp.WrapSharedMultiTouchInput.OnInput(e);
    }else {
        float x = e.getX();
        float y = e.getY();
        int finger = 0;
        com.rtsoft.rt3dapp.AppGLSurfaceView.nativeOnTouch(e.getAction(), x, y, finger);
    }
    return true;
}