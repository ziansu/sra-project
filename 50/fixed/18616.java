public void download() {
    com.telerik.plugins.mapbox.OfflineRegion.mapboxRegions.get(this.mapboxOfflineRegionId).setDownloadState(com.telerik.plugins.mapbox.com.mapbox.mapboxsdk.offline.OfflineRegion.STATE_ACTIVE);
}