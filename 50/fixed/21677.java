private void insertOrReplace(java.lang.String table, java.lang.String key, java.lang.String value) throws java.lang.Exception {
    ensureTable(table);
    java.lang.String query = com.leap12.databuddy.sqlite.SqliteDataStoreManager.toQueryInsert(table, key, com.leap12.databuddy.sqlite.SqliteDataStoreManager.Type.StringValue, value, null, 0, 0.0F);
    update(query);
}