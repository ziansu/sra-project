private com.fh.entity.TransactionsBeans saveAndupdateTransaction(com.fh.entity.TransactionsBeans t) throws java.lang.Exception {
    dao.save("WebappuserMapper.saveTransactions", t);
    com.fh.util.CacheUtil.cacheSave(t.getId(), t, "TransactionsLong");
    com.fh.util.CacheUtil.removeCache(t.getId(), "Transactions");
    return t;
}