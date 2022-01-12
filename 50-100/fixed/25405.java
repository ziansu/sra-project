@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor messagesCursor) {
    if ((messagesAdapter) == null) {
        initListView(messagesCursor);
    }else {
        messagesAdapter.changeCursor(messagesCursor);
        if ((totalEntries) > 0) {
            messagesListView.setSelection(((totalEntries) - 1));
        }
    }
}