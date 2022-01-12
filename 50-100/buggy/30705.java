public void clearIndex(int indexId) {
    if ((transaction.get()) != null)
        doClearIndex(indexId);
    
    checkOpeness();
    stateLock.acquireReadLock();
    try {
        checkOpeness();
        checkLowDiskSpaceAndFullCheckpointRequests();
        doClearIndex(indexId);
    } finally {
        stateLock.releaseReadLock();
    }
}