@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    getLocation();
    lat = location.getLatitude();
    lng = location.getLongitude();
}