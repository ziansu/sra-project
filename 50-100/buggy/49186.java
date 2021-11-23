@java.lang.Override
public com.orientechnologies.orient.core.index.OIndexManagerAbstract load() {
    if (!(autoRecreateIndexesAfterCrash())) {
        acquireExclusiveLock();
        try {
            if ((getDatabase().getStorage().getConfiguration().indexMgrRecordId) == null)
                create();
            
            ((com.orientechnologies.orient.core.id.ORecordId) (document.getIdentity())).fromString(getDatabase().getStorage().getConfiguration().indexMgrRecordId);
            super.reload("*:-1 index:0");
        } finally {
            releaseExclusiveLock();
        }
    }
    return this;
}