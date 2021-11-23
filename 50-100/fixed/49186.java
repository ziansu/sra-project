@java.lang.Override
public com.orientechnologies.orient.core.index.OIndexManagerAbstract load() {
    if (!(autoRecreateIndexesAfterCrash())) {
        acquireExclusiveLock();
        try {
            if ((com.orientechnologies.orient.core.index.OIndexManagerAbstract.getDatabase().getStorage().getConfiguration().indexMgrRecordId) == null)
                create();
            
            ((com.orientechnologies.orient.core.id.ORecordId) (document.getIdentity())).fromString(com.orientechnologies.orient.core.index.OIndexManagerAbstract.getDatabase().getStorage().getConfiguration().indexMgrRecordId);
            super.reload("*:-1 index:0");
        } finally {
            releaseExclusiveLock();
        }
    }
    return this;
}