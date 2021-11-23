private static synchronized int nextTxNumber() {
    (simpledb.tx.Transaction.nextTxNum)++;
    java.lang.System.out.println(("new transaction: " + (simpledb.tx.Transaction.nextTxNum)));
    return simpledb.tx.Transaction.nextTxNum;
}