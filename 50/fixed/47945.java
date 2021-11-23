public boolean contains(java.lang.Object key) {
    checkForRebuild();
    key = getCollatingValue(key);
    acquireSharedLock();
    try {
        return indexEngine.contains(key);
    } finally {
        releaseSharedLock();
    }
}