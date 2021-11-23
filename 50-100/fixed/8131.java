@java.lang.Override
public void toggleFullScreen() {
    try {
        if (mClearGLWindow.isFullscreen()) {
            mClearGLWindow.setFullscreen(false);
            if (((mLastWindowWidth) > 0) && ((mLastWindowHeight) > 0))
                mClearGLWindow.setSize(mLastWindowWidth, mLastWindowHeight);
            
        }else {
            mLastWindowWidth = mClearGLWindow.getWindowWidth();
            mLastWindowHeight = mClearGLWindow.getWindowHeight();
            mClearGLWindow.setFullscreen(true);
        }
        requestDisplay();
    } catch (final java.lang.Exception e) {
        e.printStackTrace();
    }
}