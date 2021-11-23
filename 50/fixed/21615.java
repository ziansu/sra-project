public void open() throws simpledb.DbException, simpledb.TransactionAbortedException {
    iterator = simpledb.Database.getCatalog().getDatabaseFile(tableid).iterator(tid);
    iterator.open();
}