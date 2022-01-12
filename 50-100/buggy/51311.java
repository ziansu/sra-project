@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    android.util.Log.d(TAG, ("New service connection service " + (service.toString())));
    org.fraunhofer.cese.madcap.services.DataCollectionService.DataCollectionServiceBinder binder = ((org.fraunhofer.cese.madcap.services.DataCollectionService.DataCollectionServiceBinder) (service));
    mDataCollectionService = binder.getService();
    mDataCollectionService.setUploadStatusGuiListener(getStatusGuiListener());
    mBound = true;
    android.util.Log.d(TAG, "added GUI UploadListener");
    getCacheCountUpdater().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
}