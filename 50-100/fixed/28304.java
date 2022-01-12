@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    lastLocation = location;
    longitude = location.getLongitude();
    latitude = location.getLatitude();
    if (location.hasAltitude()) {
        hasAltitude = true;
        altitude = location.getAltitude();
    }
    if (((longitude) != (com.google.appinventor.components.runtime.LocationSensor.UNKNOWN_VALUE)) || ((latitude) != (com.google.appinventor.components.runtime.LocationSensor.UNKNOWN_VALUE))) {
        hasLocationData = true;
        LocationChanged(latitude, longitude, altitude);
    }
}