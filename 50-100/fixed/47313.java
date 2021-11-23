protected long insert(java.lang.String table, android.content.ContentValues values) {
    long rowId = -1;
    if (com.spiddekauga.android.sqlite.SqliteGateway.isInitialized()) {
        if ((values.size()) > 0) {
            android.database.sqlite.SQLiteDatabase db = com.spiddekauga.android.sqlite.SqliteGateway.mSqlite.getWritableDatabase();
            rowId = db.insert(table, null, values);
        }
    }else {
        com.spiddekauga.android.sqlite.SqliteGateway.mExecuteLater.add(new com.spiddekauga.android.sqlite.SqliteGateway.SqlExecute(com.spiddekauga.android.sqlite.SqliteGateway.ExecuteTypes.INSERT, table, values, null, null));
    }
    return rowId;
}