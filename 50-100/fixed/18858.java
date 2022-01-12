public boolean islandsIsInDB() {
    java.lang.String QUERY = "SELECT * FROM " + (com.shpp.sv.sqlite.UserDatabaseHelper.TABLE_ISLANDS);
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(QUERY, null);
    boolean result = false;
    if (cursor != null) {
        result = cursor.moveToFirst();
        cursor.close();
    }
    return result;
}