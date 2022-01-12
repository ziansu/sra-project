public com.orientechnologies.orient.core.index.OIndex<T> clear() {
    checkForRebuild();
    modificationLock.requestModificationLock();
    try {
        acquireSharedLock();
        try {
            markStorageDirty();
            indexEngine.clear();
            return this;
        } finally {
            releaseSharedLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}