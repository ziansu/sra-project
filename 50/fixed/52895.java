void scanningDone() {
    waitResultLock.lock();
    try {
        isRunning.set(false);
        waitForResult.signalAll();
    } finally {
        waitResultLock.unlock();
    }
}