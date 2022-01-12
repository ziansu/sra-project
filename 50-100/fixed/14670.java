private void updateFirebaseData(android.location.Location location) {
    double lat = location.getLatitude();
    double lon = location.getLongitude();
    firebaseDatabaseHelper.updateOnlineUserLocation(lat, lon);
    android.util.Log.d(com.example.alex.motoproject.services.LocationListenerService.LOG_TAG, ((((("Lat " + (mCurrentLocation.getLatitude())) + " Lon ") + (mCurrentLocation.getLongitude())) + " Time ") + (mLastUpdateTime)));
}