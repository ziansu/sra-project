public int getLastPos(java.lang.String table) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(("SELECT MAX(pos) FROM " + table), null);
    cursor.moveToNext();
    if (cursor.isNull(0))
        return -1;
    
    db.close();
    return cursor.getInt(0);
}