public void requestDisplay() {
    boolean lLocked = mDisplayLock.tryLock();
    if (!lLocked)
        return ;
    
    try {
        mClearGLWindow.getGLWindow().display();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
    mDisplayLock.unlock();
}