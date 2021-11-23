public void cleanTable(java.lang.String tableName) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.execSQL(("delete from " + tableName));
    db.execSQL((("UPDATE SQLITE_SEQUENCE SET SEQ=0 WHERE NAME='" + tableName) + "'"));
}