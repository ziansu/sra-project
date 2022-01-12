public void writeBack(org.elasql.sql.RecordKey key, int sinkProcessId, org.elasql.cache.CachedRecord rec, org.vanilladb.core.storage.tx.Transaction tx) {
    org.elasql.cache.tpart.TPartCacheMgr.localStorage.writeBack(key, rec, tx);
}