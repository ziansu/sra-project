public boolean removeKeyFromIndex(int indexId, java.lang.Object key) {
    if ((transaction.get()) != null)
        doRemoveKeyFromIndex(indexId, key);
    
    checkOpeness();
    stateLock.acquireReadLock();
    try {
        checkOpeness();
        checkLowDiskSpaceAndFullCheckpointRequests();
        return doRemoveKeyFromIndex(indexId, key);
    } finally {
        stateLock.releaseReadLock();
    }
}