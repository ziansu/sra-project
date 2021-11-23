public long getTotalDuration() {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.mobike.mobike.TABLENAME, new java.lang.String[]{ FIELD_TIME }, null, null, null, null, null);
    db.close();
    cursor.moveToFirst();
    long start = cursor.getLong(0);
    cursor.moveToLast();
    long end = cursor.getLong(0);
    cursor.close();
    return (end - start) / 1000;
}