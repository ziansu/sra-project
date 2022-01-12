public void abort() {
    globalLock.lock();
    try {
        if ((this.threadPoolTaskHandler) != null) {
            if (started) {
                threadPoolTaskHandler.remove(this);
            }
            this.aborted = true;
            this.executionComplete();
        }
    } finally {
        globalLock.unlock();
    }
}