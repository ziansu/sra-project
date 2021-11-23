@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    int i = 0;
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        i++;
        cursor.moveToNext();
    } 
    mAdapter.swapCursor(cursor);
}