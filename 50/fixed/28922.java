public boolean statusCheckGPS() {
    final android.location.LocationManager manager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if (!(manager.isProviderEnabled(LocationManager.GPS_PROVIDER))) {
        buildAlertMessageNoGps();
        return false;
    }else
        return true;
    
}