public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        android.util.Log.d("Location Changed", (((location.getLatitude()) + " and ") + (location.getLongitude())));
        mLocationManager.removeUpdates(this);
        java.lang.String loc_str = ((location.getLatitude()) + "_") + (location.getLongitude());
    }
}