private void updateFirebaseData(android.location.Location location) {
    double lat = location.getLatitude();
    double lon = location.getLongitude();
    java.lang.String userId = firebaseAuth.getCurrentUser().getUid();
    firebaseDatabaseHelper.updateOnlineUserLocation(lat, lon, userId);
    android.util.Log.d(com.example.alex.motoproject.services.LocationListenerService.LOG_TAG, ((((("Lat " + (mCurrentLocation.getLatitude())) + " Lon ") + (mCurrentLocation.getLongitude())) + " Time ") + (mLastUpdateTime)));
}