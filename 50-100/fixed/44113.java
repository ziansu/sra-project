public int getNumWatchedEpisodes() {
    java.lang.String query = ((("SELECT count(*) FROM " + (com.seriesmanager.app.database.DBHelper.TABLE_EPISODE)) + " WHERE ") + (com.seriesmanager.app.database.DBHelper.COLUMN_WATCHED)) + " = 1";
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(query, null);
    int value = 0;
    if (cursor.moveToFirst())
        value = cursor.getInt(0);
    
    db.close();
    return value;
}