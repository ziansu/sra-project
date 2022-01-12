public void open() throws java.util.NoSuchElementException, simpledb.DbException, simpledb.TransactionAbortedException {
    super.open();
    child.open();
}