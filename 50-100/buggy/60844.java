public void onLocationChanged(android.location.Location newLocation) {
    if (newLocation != null) {
        android.util.Log.d("Location Changed", (((location.getLatitude()) + " and ") + (location.getLongitude())));
        mLocationManager.removeUpdates(this);
        this.location = newLocation;
    }
}