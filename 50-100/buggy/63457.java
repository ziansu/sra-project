@java.lang.Override
public org.araqne.logstorage.engine.TableLock getExclusiveTableLock(java.lang.String tableName, java.lang.String owner, java.lang.String purpose) {
    org.araqne.logstorage.engine.TableLockImpl tableLock = tableLocks.get(getTableSchema(tableName).getId());
    if (tableLock == null)
        throw new org.araqne.logstorage.engine.TableNotFoundException(tableName);
    
    return tableLock.writeLock(owner, purpose);
}