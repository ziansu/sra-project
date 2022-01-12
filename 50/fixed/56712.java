public android.database.Cursor getTableCursorFromDB(java.lang.String tableName) {
    java.lang.String selectQuery = "SELECT * FROM " + tableName;
    com.mycompany.kittylogs.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor query = db.rawQuery(selectQuery, null);
    return query;
}