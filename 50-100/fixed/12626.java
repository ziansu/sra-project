public synchronized void unlock() throws java.lang.IllegalMonitorStateException {
    java.lang.Thread callingThread = java.lang.Thread.currentThread();
    if (!(isLocked))
        throw new java.lang.IllegalMonitorStateException();
    
    if ((isLocked) && (callingThread != (lockedBy)))
        throw new java.lang.IllegalMonitorStateException();
    
    lockCount -= 1;
    if ((lockCount) == 0) {
        isLocked = false;
        lockedBy = null;
        notify();
    }
}