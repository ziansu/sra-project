@java.lang.Override
public void toggleFullScreen() {
    try {
        if (mClearGLWindow.isFullscreen()) {
            if (((mLastWindowWidth) > 0) && ((mLastWindowHeight) > 0))
                mClearGLWindow.setSize(mLastWindowWidth, mLastWindowHeight);
            
            mClearGLWindow.setFullscreen(false);
        }else {
            mLastWindowWidth = getWindowWidth();
            mLastWindowHeight = getWindowHeight();
            mClearGLWindow.setFullscreen(true);
        }
        requestDisplay();
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
    }
}