public void getAddress() {
    if (!(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))) {
        mainLayout.setVisibility(View.GONE);
        buildAlertMessageNoGps();
    }else
        if (!(isConn())) {
            mainLayout.setVisibility(View.GONE);
            buildAlertMessageNoInternet();
        }else {
            mainLayout.setVisibility(View.VISIBLE);
            android.location.LocationListener locationListener = new com.example.weatherapplication.MainActivity.MyLocationListener();
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, locationListener);
        }
    
}