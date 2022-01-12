@java.lang.Override
public void deleteWithoutIndexLoad(java.lang.String indexName) {
    modificationLock.requestModificationLock();
    try {
        acquireExclusiveLock();
        try {
            markStorageDirty();
            indexEngine.deleteWithoutLoad(indexName);
        } finally {
            releaseExclusiveLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}