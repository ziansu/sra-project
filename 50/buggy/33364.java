@java.lang.Override
public void set(java.lang.String key, java.lang.Object value, int expires) {
    storage.saveFile(((ca.omny.db.extended.StorageBasedDatabase.DB_PREFIX) + key), value);
}