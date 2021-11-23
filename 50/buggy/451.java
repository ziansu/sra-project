@java.lang.Override
public void commit() {
    com.orientechnologies.orient.core.index.OIndexAbstract.acquireExclusiveLock();
    try {
        final com.orientechnologies.orient.core.index.OIndexAbstract.IndexTxSnapshot indexTxSnapshot = txSnapshot.get();
        if (indexTxSnapshot.clear)
            clear();
        
        commitSnapshot(indexTxSnapshot.indexSnapshot);
    } finally {
        com.orientechnologies.orient.core.index.OIndexAbstract.releaseExclusiveLock();
    }
}