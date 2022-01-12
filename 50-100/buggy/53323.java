private com.couchbase.lite.Status inTransaction(com.couchbase.lite.store.ForestDBStore.Task task) {
    com.couchbase.lite.Status status = new com.couchbase.lite.Status(com.couchbase.lite.Status.OK);
    boolean commit = false;
    beginTransaction();
    try {
        status = task.run();
        commit = !(status.isError());
    } finally {
        endTransaction(commit);
    }
    return status;
}