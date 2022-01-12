private void initLoc() {
    mLocationClient = new com.amap.api.location.AMapLocationClient(getApplicationContext());
    mLocationClient.setLocationListener(this);
    mLocationOption = new com.amap.api.location.AMapLocationClientOption();
    mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
    mLocationOption.setNeedAddress(true);
    mLocationOption.setOnceLocation(true);
    mLocationOption.setWifiActiveScan(true);
    mLocationOption.setMockEnable(false);
    mLocationOption.setInterval(2000);
    mLocationClient.setLocationOption(mLocationOption);
    mLocationClient.startLocation();
}