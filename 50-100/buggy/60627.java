public void insertAll(java.util.Collection<java.lang.Object> objects) {
    writeLock.lock();
    db.beginTransaction();
    try {
        for (java.lang.Object object : objects) {
            bindInsertStatementArgs(object);
            insertStatement.executeInsert();
        }
        db.setTransactionSuccessful();
    } finally {
        db.endTransaction();
        writeLock.unlock();
    }
}