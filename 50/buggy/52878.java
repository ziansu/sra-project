@java.lang.Override
public void onProviderEnabled(java.lang.String provider) {
    com.example.gdev.unipicityguide.MainActivity.locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
}