public void onLocationChanged(android.location.Location newLocation) {
    if (newLocation != null) {
        android.util.Log.d("Location Changed", (((newLocation.getLatitude()) + " and ") + (newLocation.getLongitude())));
        mLocationManager.removeUpdates(this);
        this.location = newLocation;
    }
}