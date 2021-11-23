protected int delete(java.lang.String table, java.lang.String whereClause) {
    int rowsAffected = 0;
    if (com.spiddekauga.android.sqlite.SqliteGateway.isInitialized()) {
        android.database.sqlite.SQLiteDatabase db = com.spiddekauga.android.sqlite.SqliteGateway.mSqlite.getWritableDatabase();
        rowsAffected = db.delete(table, whereClause, null);
        db.close();
    }else {
        com.spiddekauga.android.sqlite.SqliteGateway.mExecuteLater.add(new com.spiddekauga.android.sqlite.SqliteGateway.SqlExecute(com.spiddekauga.android.sqlite.SqliteGateway.ExecuteTypes.DELETE, table, null, whereClause, null));
    }
    return rowsAffected;
}