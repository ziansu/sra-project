@java.lang.Override
public void run() {
    org.vanilladb.core.storage.tx.Transaction tx = org.vanilladb.core.server.VanillaDb.txMgr().newTransaction(java.sql.Connection.TRANSACTION_SERIALIZABLE, false, 1);
    org.elasql.cache.CachedRecord record = org.elasql.cache.tpart.WriteBackTest.createCachedRecord(1, 10001);
    record.setNewInserted(true);
    localStorage.writeBack(commonKey, record, tx);
}