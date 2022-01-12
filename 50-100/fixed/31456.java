private void initGPS() {
    myLocationManager = ((android.location.LocationManager) (this.getSystemService(Context.LOCATION_SERVICE)));
    flagGPSEnable = myLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    flagNetworkEnable = myLocationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    flagGetGPSDone = !(flagGPSEnable);
    flagNetworkDone = !(flagNetworkEnable);
    bestLocation = null;
    counts = 0;
    startAllUpdate();
    handler.postDelayed(showTime, 1000);
}