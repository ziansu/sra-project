public int getNumTotalShows() {
    java.lang.String query = "SELECT count(*) FROM " + (com.seriesmanager.app.database.DBHelper.TABLE_SHOW);
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(query, null);
    cursor.moveToFirst();
    int value = cursor.getInt(0);
    db.close();
    return value;
}