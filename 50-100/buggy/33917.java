private void updateLocation(android.location.Location location) {
    double latitiude = location.getLatitude();
    double longitude = location.getLongitude();
    android.util.Log.d(com.huhx0015.doordashchallenge.services.LocationService.LOG_TAG, ((("updateLocation(): Latitude: " + latitiude) + " | Longitude: ") + longitude));
    mIsLocationFound = true;
    mListener.onLocationUpdated(location.getLatitude(), location.getLongitude());
}