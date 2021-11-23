private void unbindConnection() {
    MyApplication.madcapLogger.d(TAG, ("Attempt to unbind self. Current bound status is " + (mBound)));
    cacheCountUpdater.cancel(true);
    mDataCollectionService.setUploadStatusGuiListener(null);
    getActivity().getApplicationContext().unbindService(mConnection);
    android.util.Log.d(TAG, "removed UploadListener");
    mBound = false;
}