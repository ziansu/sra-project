public void createCacheRecordFromSink(org.elasql.sql.RecordKey key, int mySinkProcessId) {
    org.elasql.cache.CachedRecord rec = cacheMgr.readFromSink(key, mySinkProcessId, tx);
    rec.setSrcTxNum(txNum);
    cacheMgr.passToTheNextTx(key, rec, localStorageId, new java.lang.Long[]{ txNum });
}