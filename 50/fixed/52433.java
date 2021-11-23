public void flush() {
    acquireSharedLock();
    try {
        indexEngine.flush();
    } finally {
        releaseSharedLock();
    }
}