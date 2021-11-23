@java.lang.Override
public boolean runInTransaction(com.couchbase.lite.TransactionalTask transactionalTask) {
    boolean shouldCommit = true;
    if (!(beginTransaction()))
        return false;
    
    try {
        shouldCommit = transactionalTask.run();
    } catch (java.lang.Exception e) {
        shouldCommit = false;
        com.couchbase.lite.util.Log.e(TAG, e.toString(), e);
        throw new java.lang.RuntimeException(e);
    } finally {
        if (!(endTransaction(shouldCommit)))
            return false;
        
    }
    return shouldCommit;
}