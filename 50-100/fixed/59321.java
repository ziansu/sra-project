@java.lang.Override
public void run() {
    org.vanilladb.core.storage.tx.Transaction tx = org.vanilladb.core.server.VanillaDb.txMgr().newTransaction(java.sql.Connection.TRANSACTION_SERIALIZABLE, false, 2);
    org.elasql.cache.CachedRecord record = localStorage.read(commonKey, tx);
    try {
        returnQueue.put(record);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}