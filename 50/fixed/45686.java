private static synchronized int nextTxNumber() {
    (simpledb.tx.Transaction.nextTxNum)++;
    return simpledb.tx.Transaction.nextTxNum;
}