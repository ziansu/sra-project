protected void execSQL(java.lang.String sql) throws java.sql.SQLException {
    if (com.spiddekauga.android.sqlite.SqliteGateway.isInitialized()) {
        android.database.sqlite.SQLiteDatabase db = com.spiddekauga.android.sqlite.SqliteGateway.mSqlite.getWritableDatabase();
        db.execSQL(sql);
    }else {
        com.spiddekauga.android.sqlite.SqliteGateway.mExecuteLater.add(new com.spiddekauga.android.sqlite.SqliteGateway.SqlExecute(com.spiddekauga.android.sqlite.SqliteGateway.ExecuteTypes.EXEC, null, null, null, sql));
    }
}