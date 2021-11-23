public void insertOrIgnore(java.lang.Object object) {
    writeLock.lock();
    try {
        bindInsertStatementArgs(insertOrIgnoreStatement, object);
        insertOrIgnoreStatement.execute();
    } finally {
        writeLock.unlock();
    }
}