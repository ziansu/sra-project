public com.fh.entity.TransactionsBeans getTransactionFromCache(java.lang.String id, java.lang.String Cachename) throws java.lang.Exception {
    net.sf.ehcache.Element o = com.fh.util.CacheUtil.getCacheObject(id, Cachename);
    com.fh.entity.TransactionsBeans transactionsBeans = null;
    if (o != null) {
        transactionsBeans = ((com.fh.entity.TransactionsBeans) (o.getObjectValue()));
    }
    return transactionsBeans;
}