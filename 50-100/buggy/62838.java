@java.lang.Override
public int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) {
    final android.database.sqlite.SQLiteDatabase db = new com.example.dylanbaker.green_glass_door.provider.ScoresDbHelper(getContext()).getWritableDatabase();
    int rows = db.update(ScoresContract.ScoresEntry.TABLE_NAME, values, getSelection(uri, selection), selectionArgs);
    if (rows > 0) {
        getContext().getContentResolver().notifyChange(uri, null);
    }
    return rows;
}