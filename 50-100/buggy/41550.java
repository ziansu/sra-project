public void start() {
    globalLock.lock();
    try {
        if ((!(started)) && (!(aborted))) {
            this.threadPoolTaskHandler.add(this);
            this.started = true;
        }
    } finally {
        globalLock.unlock();
    }
}