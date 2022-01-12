public com.orientechnologies.orient.core.index.OIndex<T> clear() {
    checkForRebuild();
    modificationLock.requestModificationLock();
    try {
        com.orientechnologies.orient.core.index.OIndexAbstract.acquireSharedLock();
        try {
            markStorageDirty();
            indexEngine.clear();
            return this;
        } finally {
            com.orientechnologies.orient.core.index.OIndexAbstract.releaseSharedLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}