@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    adapter.notifyDataSetChanged();
    updateTitleAndUnread();
}