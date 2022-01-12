protected void onResume() {
    super.onResume();
    try {
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    } catch (java.lang.SecurityException e) {
        android.widget.Toast.makeText(this, "No authorization for the processing of data", Toast.LENGTH_LONG).show();
    }
    checkEnabled();
}