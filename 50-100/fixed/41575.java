public void onDestroy() {
    android.util.Log.d(GTG.TAG, "OsmMapGpsTrailerReviewerMapActivity.onDestory() start");
    super.onDestroy();
    if ((osmMapView) != null)
        osmMapView.onDestroy();
    
    GTG.cacheCreatorLock.registerReadingThread();
    try {
        cleanup();
        android.util.Log.d(GTG.TAG, "OsmMapGpsTrailerReviewerMapActivity.onDestory() end");
    } finally {
        GTG.cacheCreatorLock.unregisterReadingThread();
    }
}