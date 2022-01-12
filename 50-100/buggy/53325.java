public void createCacheRecordFromSink(org.elasql.sql.RecordKey key, int mySinkProcessId, java.lang.Long... dests) {
    org.elasql.cache.CachedRecord rec = cacheMgr.readFromSink(key, mySinkProcessId, tx);
    rec.setSrcTxNum(txNum);
    cacheMgr.passToTheNextTx(key, rec, localStorageId, dests);
}