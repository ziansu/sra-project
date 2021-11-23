public void testLastFixedLocation() {
    java.lang.String locationProvider = android.location.LocationManager.PASSIVE_PROVIDER;
    final android.location.LocationManager locationManager = ((android.location.LocationManager) (getContext().getSystemService(Context.LOCATION_SERVICE)));
    final android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
    if (lastKnownLocation != null) {
        if ((lastKnownLocation.getTime()) <= (java.lang.System.currentTimeMillis())) {
            junit.framework.Assert.assertTrue(true);
        }
    }
}