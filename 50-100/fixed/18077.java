public void open() throws simpledb.DbException, simpledb.TransactionAbortedException {
    try {
        super.open();
        it.open();
    } catch (simpledb.TransactionAbortedException e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    } catch (simpledb.DbException e) {
        e.printStackTrace();
        java.lang.System.exit(0);
    }
}