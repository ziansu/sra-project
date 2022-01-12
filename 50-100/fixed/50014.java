public com.orientechnologies.orient.core.index.OIndexInternal<T> delete() {
    modificationLock.requestModificationLock();
    try {
        acquireExclusiveLock();
        try {
            markStorageDirty();
            indexEngine.delete();
            if ((getDatabase().getMetadata()) != null)
                getDatabase().getMetadata().getIndexManager().removeClassPropertyIndex(this);
            
            removeValuesContainer();
            return this;
        } finally {
            releaseExclusiveLock();
        }
    } finally {
        modificationLock.releaseModificationLock();
    }
}