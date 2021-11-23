public void insert(java.lang.Object object) {
    writeLock.lock();
    try {
        bindInsertStatementArgs(insertStatement, object);
        insertStatement.executeInsert();
    } finally {
        writeLock.unlock();
    }
}