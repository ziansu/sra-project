public void rewind() throws java.util.NoSuchElementException, simpledb.DbException, simpledb.TransactionAbortedException {
    this.it.close();
    this.it.open();
}