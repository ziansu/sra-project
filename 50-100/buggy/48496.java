private java.lang.Long getEntityId(java.lang.String tableName, java.lang.String columnName, java.lang.String entityName) {
    final java.lang.String SQL_GET_ENTITY = ((((((("SELECT " + (android.provider.BaseColumns._ID)) + " FROM ") + tableName) + " WHERE ") + columnName) + " = '") + entityName) + "' LIMIT 1";
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(SQL_GET_ENTITY, null);
    if (cursor.moveToFirst()) {
        return cursor.getLong(0);
    }
    return null;
}