@java.lang.Override
public void run() {
    org.vanilladb.core.storage.tx.Transaction tx = org.vanilladb.core.server.VanillaDb.txMgr().newTransaction(java.sql.Connection.TRANSACTION_SERIALIZABLE, false, 3);
    org.elasql.cache.CachedRecord record = localStorage.read(commonKey, tx);
    record.setVal("tvalue", new org.vanilladb.core.sql.IntegerConstant(20001));
    localStorage.writeBack(commonKey, record, tx);
}