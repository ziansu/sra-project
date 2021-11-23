@java.lang.Override
public void onCreate(com.mapbox.mapboxsdk.offline.OfflineRegion offlineRegion) {
    offlineRegion.setObserver(getOfflineRegionObserver(area));
    offlineRegion.setDownloadState(OfflineRegion.STATE_ACTIVE);
}