private com.fh.entity.TransactionsBeans saveAndupdateTransaction(com.fh.entity.TransactionsBeans t, int status) throws java.lang.Exception {
    t.setStatus(status);
    dao.save("WebappuserMapper.saveTransactions", t);
    com.fh.util.CacheUtil.cacheSave(t.getId(), t, "TransactionsLong");
    com.fh.util.CacheUtil.removeCache(t.getId(), "Transactions");
    return t;
}