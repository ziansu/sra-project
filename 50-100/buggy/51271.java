protected int update(java.lang.String table, android.content.ContentValues values, java.lang.String whereClause) {
    int rowsAffected = 0;
    if (com.spiddekauga.android.sqlite.SqliteGateway.isInitialized()) {
        android.database.sqlite.SQLiteDatabase db = com.spiddekauga.android.sqlite.SqliteGateway.mSqlite.getWritableDatabase();
        rowsAffected = db.update(table, values, whereClause, null);
        db.close();
    }else {
        com.spiddekauga.android.sqlite.SqliteGateway.mExecuteLater.add(new com.spiddekauga.android.sqlite.SqliteGateway.SqlExecute(com.spiddekauga.android.sqlite.SqliteGateway.ExecuteTypes.UPDATE, table, values, whereClause, null));
    }
    return rowsAffected;
}