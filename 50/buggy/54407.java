public void insert(java.lang.Object object) {
    writeLock.lock();
    try {
        bindInsertStatementArgs(object);
        insertStatement.executeInsert();
    } finally {
        writeLock.unlock();
    }
}