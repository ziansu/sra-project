private synchronized void insertVersion(java.util.ArrayList<android.content.ContentValues> insertList) {
    if (!(insertList.isEmpty())) {
        getContentResolver().bulkInsert(TvBrowserContentProvider.CONTENT_URI_DATA_VERSION, insertList.toArray(new android.content.ContentValues[insertList.size()]));
        insertList.clear();
    }
}