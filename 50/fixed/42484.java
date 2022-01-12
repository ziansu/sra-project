@java.lang.Override
protected void stopUpdates() {
    if (!(mIsActive))
        return ;
    
    mIsActive = false;
    synchronized(thread) {
        thread.notifyAll();
    }
}