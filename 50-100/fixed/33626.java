public boolean recordRating(java.lang.String stationId) {
    android.database.sqlite.SQLiteDatabase database = this.getReadableDatabase();
    java.lang.String query = "SELECT * FROM rating  WHERE stationId = " + stationId;
    android.database.Cursor cursor = database.rawQuery(query, null);
    if ((cursor.getCount()) <= 0) {
        android.util.Log.i("EXISTSRATING", "no");
        cursor.close();
        database.close();
        return false;
    }
    android.util.Log.i("EXISTSRATING", "yes");
    cursor.close();
    database.close();
    return true;
}