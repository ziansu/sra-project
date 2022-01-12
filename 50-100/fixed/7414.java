@java.lang.Override
public void onClick(android.view.View view) {
    if ((mSearchResult) != null) {
        android.content.ContentValues historyValues = new android.content.ContentValues();
        historyValues.put(DataContract.HistoryEntry.COLUMN_RESTAURANT_ID, mSearchResult.getRestID());
        historyValues.put(DataContract.HistoryEntry.COLUMN_RESTAURANT_NAME, mSearchResult.getRestName());
        android.net.Uri uri = getActivity().getContentResolver().insert(DataContract.HistoryEntry.CONTENT_URI, historyValues);
        android.util.Log.d("history check", uri.toString());
        onLocationChaged(curLatitude, curLongitude);
    }
}