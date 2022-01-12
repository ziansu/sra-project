public boolean recordExists(java.lang.String id) {
    android.database.sqlite.SQLiteDatabase database = this.getReadableDatabase();
    java.lang.String query = "SELECT * FROM walksG  WHERE id = " + id;
    android.database.Cursor cursor = database.rawQuery(query, null);
    if ((cursor.getCount()) <= 0) {
        android.util.Log.i("EXISTS1", "no");
        cursor.close();
        return false;
    }
    android.util.Log.i("EXISTS1", "yes");
    cursor.close();
    return true;
}