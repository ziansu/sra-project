private void resetLocationTrackingMode() {
    try {
        com.mapbox.mapboxsdk.maps.TrackingSettings trackingSettings = mMapboxMap.getTrackingSettings();
        trackingSettings.setMyLocationTrackingMode(MyLocationTracking.TRACKING_NONE);
    } catch (java.lang.SecurityException ignore) {
    }
}