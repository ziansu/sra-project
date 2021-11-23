private void setupMapUI(com.amap.api.maps.AMap map) {
    map.setMyLocationEnabled(false);
    com.amap.api.maps.UiSettings mUiSettings = map.getUiSettings();
    mUiSettings.setMyLocationButtonEnabled(false);
    mUiSettings.setCompassEnabled(false);
    mUiSettings.setTiltGesturesEnabled(false);
    mUiSettings.setZoomControlsEnabled(false);
    mUiSettings.setRotateGesturesEnabled(mAppPrefs.isMapRotationEnabled());
}