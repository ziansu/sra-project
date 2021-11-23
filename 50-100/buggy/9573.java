private void unbindConnection() {
    MyApplication.madcapLogger.d(TAG, ("Attempt to unbind self. Current bound status is " + (mBound)));
    mDataCollectionService.setUploadStatusGuiListener(null);
    getActivity().getApplicationContext().unbindService(mConnection);
    android.util.Log.d(TAG, "removed UploadListener");
    mBound = false;
    cacheCountUpdater.cancel(true);
}