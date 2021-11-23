private void insertRecord(java.lang.String tableName, android.content.ContentValues contentValues) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insertOrThrow(tableName, null, contentValues);
    db.close();
}