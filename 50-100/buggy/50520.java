public static android.database.Cursor readData(android.content.Context context, java.lang.String tableName, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String order) {
    com.examples.antonio.popularmovies.data.DBHelper dbHelper = new com.examples.antonio.popularmovies.data.DBHelper(context);
    android.database.sqlite.SQLiteDatabase db = dbHelper.getReadableDatabase();
    android.database.Cursor c = db.query(tableName, projection, selection, selectionArgs, null, null, order);
    return c;
}