public void putIndexValue(int indexId, java.lang.Object key, java.lang.Object value) {
    if ((transaction.get()) != null)
        doPutIndexValue(indexId, key, value);
    
    checkOpeness();
    stateLock.acquireReadLock();
    try {
        checkOpeness();
        checkLowDiskSpaceAndFullCheckpointRequests();
        doPutIndexValue(indexId, key, value);
    } finally {
        stateLock.releaseReadLock();
    }
}