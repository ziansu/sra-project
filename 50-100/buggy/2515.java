@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> cursorLoader, android.database.Cursor cursor) {
    int i = 0;
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        i++;
        cursor.moveToNext();
    } 
    mAdapter.swapCursor(cursor);
    android.content.Intent dataUpdatedIntent = new android.content.Intent(barqsoft.footballscores.service.myFetchService.ACTION_DATA_UPDATED).setPackage(getActivity().getPackageName());
    getActivity().sendBroadcast(dataUpdatedIntent);
}