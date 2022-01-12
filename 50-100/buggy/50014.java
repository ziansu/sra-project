public com.orientechnologies.orient.core.index.OIndexInternal<T> delete() {
    modificationLock.requestModificationLock();
    try {
        com.orientechnologies.orient.core.index.OIndexAbstract.acquireExclusiveLock();
        try {
            markStorageDirty();
            indexEngine.delete();
            if ((getDatabase().getMetadata()) != null)
                getDatabase().getMetadata().getIndexManager().removeClassPropertyIndex(this);
            
            removeValuesContainer();
            return this;
        } finally {
            com.orientechnologies.orient.core.index.OIndexAbstract.releaseExclusiveLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}