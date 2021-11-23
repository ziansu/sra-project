public android.database.Cursor getMatchesList(java.lang.String username) {
    java.lang.String data = "";
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.database.Cursor cursor = db.query(com.example.kk.fydipkk1.MyDBHandler.TABLE_MATCH, null, (((com.example.kk.fydipkk1.MyDBHandler.COLUMN_USER) + " = ") + username), null, null, null, null);
    return cursor;
}