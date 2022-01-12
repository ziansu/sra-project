private void setupMapUI(com.baidu.mapapi.map.BaiduMap map) {
    map.setMyLocationEnabled(true);
    map.setMyLocationConfigeration(new com.baidu.mapapi.map.MyLocationConfiguration(com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.NORMAL, true, null));
    map.setMapType(BaiduMap.MAP_TYPE_SATELLITE);
    mBDLocClient = new com.baidu.location.LocationClient(getActivity().getApplicationContext());
    mBDLocClient.registerLocationListener(mBDLocListener);
    com.baidu.mapapi.map.UiSettings mUiSettings = map.getUiSettings();
    mUiSettings.setCompassEnabled(false);
    mUiSettings.setOverlookingGesturesEnabled(false);
    mUiSettings.setZoomGesturesEnabled(false);
}