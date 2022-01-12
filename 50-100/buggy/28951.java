public void rewind() throws simpledb.DbException, simpledb.TransactionAbortedException {
    try {
        it.rewind();
    } catch (simpledb.DbException e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    } catch (simpledb.TransactionAbortedException e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    }
}