private synchronized void update(java.util.ArrayList<android.content.ContentProviderOperation> updateList) {
    if ((updateList != null) && (!(updateList.isEmpty()))) {
        try {
            getContentResolver().applyBatch(TvBrowserContentProvider.AUTHORITY, updateList);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        } catch (android.content.OperationApplicationException e) {
            e.printStackTrace();
        }
        updateList.clear();
    }
}