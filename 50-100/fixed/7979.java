private void locate() {
    mLocationOption = new com.amap.api.location.AMapLocationClientOption();
    mLocationOption.setLocationMode(AMapLocationMode.Hight_Accuracy);
    mLocationOption.setNeedAddress(true);
    mLocationOption.setOnceLocation(true);
    mLocationOption.setWifiActiveScan(true);
    mLocationOption.setMockEnable(false);
    mLocationClient.setLocationOption(mLocationOption);
    mLocationClient.startLocation();
}