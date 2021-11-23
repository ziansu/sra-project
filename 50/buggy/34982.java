@java.lang.Override
protected void onStart() {
    super.onStart();
    mBaiduMap.setMyLocationEnabled(true);
    if (!(mLocationClient.isStarted())) {
        mLocationClient.start();
    }
}