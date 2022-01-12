public void pending() throws lockmgr.DeadlockException {
    synchronized(waitingThread) {
        try {
            waitingThread.wait(LockManager.DEADLOCK_TIMEOUT);
            throw new lockmgr.DeadlockException(tid, "Sleep timeout...deadlock.");
        } catch (java.lang.InterruptedException ignored) {
        }
    }
}