public int getSyncMsec(int ms) {
    this.lock.lock();
    try {
        (this.syncCount)--;
        while (ms == (msec)) {
            try {
                free.await();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
            }
        } 
        free.signalAll();
    } finally {
        lock.unlock();
    }
    return msec;
}