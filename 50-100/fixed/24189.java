@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    if ((!(isAdded())) || (cursor == null)) {
        return ;
    }
    if ((firstRun) && ((cursor.getCount()) == 0)) {
        entryFilter.setVisibility(View.GONE);
    }
    firstRun = false;
    adapter.swapCursor(cursor);
    getActivity().supportInvalidateOptionsMenu();
}