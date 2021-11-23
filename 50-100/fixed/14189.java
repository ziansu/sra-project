public void getLocation() {
    locationManager = ((android.location.LocationManager) (this.getSystemService(Context.LOCATION_SERVICE)));
    android.location.LocationListener locationListener = new android.location.LocationListener() {
        @java.lang.Override
        public void onLocationChanged(android.location.Location location) {
            userLocation = location;
        }

        @java.lang.Override
        public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
        }

        @java.lang.Override
        public void onProviderEnabled(java.lang.String provider) {
        }

        @java.lang.Override
        public void onProviderDisabled(java.lang.String provider) {
        }
    };
    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
}