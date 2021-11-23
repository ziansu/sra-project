protected void showCurrentLocation() {
    location = edu.aku.hassannaqvi.dss_census.core.MainApp.locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    if ((location) != null) {
        java.lang.String message = java.lang.String.format("Current Location \n Longitude: %1$s \n Latitude: %2$s", location.getLongitude(), location.getLatitude());
    }
}