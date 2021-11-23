private void updateLocation(android.location.Location location) {
    mCurrentLocation = location;
    double latitude = mCurrentLocation.getLatitude();
    double longitude = mCurrentLocation.getLongitude();
    stationManager.updateLocation(latitude, longitude);
    route = stationManager.updateNexttation(route);
    setRouteTravel();
    binding.estimateTime.setText((((("ถึงสถานี" + (desName)) + " ในอีก ") + (stationManager.updateTimeToArrive())) + " นาที"));
}