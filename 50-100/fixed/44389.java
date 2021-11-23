@java.lang.Override
public int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
    final android.database.sqlite.SQLiteDatabase db = mMovieDBHelper.getWritableDatabase();
    int rowDeleted;
    java.lang.String tableName = getTableName(uri);
    rowDeleted = db.delete(tableName, selection, selectionArgs);
    android.content.Context context = getContext();
    if ((context != null) && (rowDeleted > 0)) {
        context.getContentResolver().notifyChange(uri, null);
    }
    return rowDeleted;
}