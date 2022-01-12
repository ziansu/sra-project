protected long replace(java.lang.String table, android.content.ContentValues initialValues) {
    long rowId = -1;
    if (com.spiddekauga.android.sqlite.SqliteGateway.isInitialized()) {
        if ((initialValues.size()) > 0) {
            android.database.sqlite.SQLiteDatabase db = com.spiddekauga.android.sqlite.SqliteGateway.mSqlite.getWritableDatabase();
            rowId = db.replace(table, null, initialValues);
            db.close();
        }
    }else {
        com.spiddekauga.android.sqlite.SqliteGateway.mExecuteLater.add(new com.spiddekauga.android.sqlite.SqliteGateway.SqlExecute(com.spiddekauga.android.sqlite.SqliteGateway.ExecuteTypes.REPLACE, table, initialValues, null, null));
    }
    return rowId;
}