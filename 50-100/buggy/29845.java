public android.location.Location findLocation() {
    if (dimappers.android.PubData.Constants.emulator) {
        android.location.Location location = new android.location.Location("Test Location - Emulator");
        location.setLatitude(52.0);
        location.setLongitude((-1.5));
        return location;
    }else {
        android.location.Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        if (location != null) {
            return location;
        }else {
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
        }
        return l;
    }
}