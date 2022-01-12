public boolean hasNext() throws simpledb.DbException, simpledb.TransactionAbortedException {
    return (it) == null ? false : it.hasNext();
}