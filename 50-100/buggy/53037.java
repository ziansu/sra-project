public void updateIndexEntry(int indexId, java.lang.Object key, java.util.concurrent.Callable<java.lang.Object> valueCreator) {
    if ((transaction.get()) != null)
        doUpdateIndexEntry(indexId, key, valueCreator);
    
    checkOpeness();
    stateLock.acquireReadLock();
    try {
        checkOpeness();
        checkLowDiskSpaceAndFullCheckpointRequests();
        doUpdateIndexEntry(indexId, key, valueCreator);
    } finally {
        stateLock.releaseReadLock();
    }
}