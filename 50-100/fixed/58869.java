private void setupMapUI(com.amap.api.maps.AMap map) {
    map.setMyLocationEnabled(false);
    com.amap.api.maps.UiSettings mUiSettings = map.getUiSettings();
    mUiSettings.setMyLocationButtonEnabled(false);
    mUiSettings.setCompassEnabled(true);
    mUiSettings.setTiltGesturesEnabled(true);
    mUiSettings.setZoomControlsEnabled(true);
    mUiSettings.setRotateGesturesEnabled(mAppPrefs.isMapRotationEnabled());
}