private void checkLocationOn() {
    android.location.LocationManager locationManager = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    if ((!(locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))) && (!(locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)))) {
        android.widget.Toast.makeText(this, "Please Enable Location", Toast.LENGTH_LONG).show();
        return ;
    }
}