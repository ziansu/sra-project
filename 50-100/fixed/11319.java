public int getSyncMsec(int ms) {
    this.lock.lock();
    try {
        while ((ms == (msec)) && ((this.syncCount) == 0)) {
            try {
                free.await();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
            }
        } 
        (this.syncCount)--;
        free.signalAll();
    } finally {
        lock.unlock();
    }
    return msec;
}