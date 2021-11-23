private void locate() {
    mLocationOption = new com.amap.api.location.AMapLocationClientOption();
    mLocationOption.setLocationMode(AMapLocationMode.Hight_Accuracy);
    mLocationOption.setNeedAddress(true);
    mLocationOption.setOnceLocation(false);
    mLocationOption.setWifiActiveScan(true);
    mLocationOption.setMockEnable(false);
    mLocationOption.setInterval(2000);
    mLocationClient.setLocationOption(mLocationOption);
    mLocationClient.startLocation();
}