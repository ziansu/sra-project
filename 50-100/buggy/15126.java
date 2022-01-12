@java.lang.Override
public boolean runInTransaction(com.couchbase.lite.TransactionalTask transactionalTask) {
    boolean shouldCommit = true;
    beginTransaction();
    try {
        shouldCommit = transactionalTask.run();
    } catch (java.lang.Exception e) {
        shouldCommit = false;
        com.couchbase.lite.util.Log.e(TAG, e.toString(), e);
        throw new java.lang.RuntimeException(e);
    } finally {
        endTransaction(shouldCommit);
    }
    return shouldCommit;
}