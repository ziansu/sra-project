public void clearMarkers() {
    com.jstakun.gms.android.utils.LoggerUtils.debug("Removing all markers from Google Map!");
    com.jstakun.gms.android.google.maps.GoogleMarkerClusterOverlay.readWriteLock.writeLock().lock();
    try {
        mClusterManager.clearItems();
    } finally {
        com.jstakun.gms.android.google.maps.GoogleMarkerClusterOverlay.readWriteLock.writeLock().unlock();
    }
    mClusterManager.cluster();
}