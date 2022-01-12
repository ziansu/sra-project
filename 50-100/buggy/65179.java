@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if ((((loader.getId()) == (com.sanderp.bartrider.TripDrawerFragment.LOADER_ID)) && (data != null)) && ((data.getCount()) > 0)) {
        android.util.Log.d(com.sanderp.bartrider.TripDrawerFragment.TAG, android.database.DatabaseUtils.dumpCursorToString(data));
        favoritesTable = data;
        mAdapter.swapCursor(data);
    }
}