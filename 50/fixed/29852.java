@java.lang.Override
public void onLoadFinished(Loader<android.database.Cursor> loader, android.database.Cursor cursor) {
    adapter.swapCursor(cursor);
    adapter.notifyDataSetChanged();
}