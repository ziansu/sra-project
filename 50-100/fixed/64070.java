@java.lang.Override
public int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
    int rows = db.delete(ScoresContract.ScoresEntry.TABLE_NAME, getSelection(uri, selection), selectionArgs);
    if (rows > 0) {
        getContext().getContentResolver().notifyChange(uri, null);
    }
    return rows;
}