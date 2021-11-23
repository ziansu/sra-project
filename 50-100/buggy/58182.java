@java.lang.Override
public void deleteWithoutIndexLoad(java.lang.String indexName) {
    modificationLock.requestModificationLock();
    try {
        com.orientechnologies.orient.core.index.OIndexAbstract.acquireExclusiveLock();
        try {
            markStorageDirty();
            indexEngine.deleteWithoutLoad(indexName);
        } finally {
            com.orientechnologies.orient.core.index.OIndexAbstract.releaseExclusiveLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}