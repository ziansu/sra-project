public void abort() {
    globalLock.lock();
    try {
        if ((threadPoolTaskHandler) != null) {
            if (started) {
                threadPoolTaskHandler.remove(this);
            }
            aborted = true;
            executionComplete();
        }
    } finally {
        globalLock.unlock();
    }
}