@java.lang.Override
public org.araqne.logstorage.engine.TableLock getSharedTableLock(java.lang.String tableName) {
    org.araqne.logstorage.engine.TableLockImpl tableLock = tableLocks.get(getTableSchema(tableName, true).getId());
    if (tableLock == null)
        throw new org.araqne.logstorage.engine.TableNotFoundException(tableName);
    
    return tableLock.readLock();
}