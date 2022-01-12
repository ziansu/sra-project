public void start() {
    globalLock.lock();
    try {
        if ((!(started)) && (!(aborted))) {
            threadPoolTaskHandler.add(this);
            started = true;
        }
    } finally {
        globalLock.unlock();
    }
}