public void download() {
    android.util.Log.d(com.telerik.plugins.mapbox.OfflineRegion.LOG_TAG, "download()");
    com.telerik.plugins.mapbox.OfflineRegion.mapboxRegions.get(this.mapboxOfflineRegionId).setDownloadState(com.telerik.plugins.mapbox.com.mapbox.mapboxsdk.offline.OfflineRegion.STATE_ACTIVE);
}