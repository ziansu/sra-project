@java.lang.Override
public int getLocation(org.elasql.sql.RecordKey key) {
    if (key.getTableName().equals(org.elasql.storage.metadata.NotificationPartMetaMgr.TABLE_NAME))
        return -1;
    
    return underliedPartMetaMgr.getLocation(key);
}