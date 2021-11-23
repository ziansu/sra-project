@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    android.widget.Toast.makeText(getApplicationContext(), "Provider working", Toast.LENGTH_SHORT).show();
    mTaskCursorAdapter.swapCursor(data);
}