private android.database.Cursor getAllRows() {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.mobike.mobike.TABLENAME, new java.lang.String[]{ FIELD_ID , FIELD_LAT , FIELD_LNG , FIELD_ALT , FIELD_TIME , FIELD_DIST }, null, null, null, null, null);
    return cursor;
}