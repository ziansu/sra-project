public void requestDisplay() {
    final boolean lLocked = mDisplayLock.tryLock();
    if (!lLocked)
        return ;
    
    try {
        mClearGLWindow.display();
    } catch (final java.lang.Throwable e) {
        e.printStackTrace();
    }
    mDisplayLock.unlock();
}