@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    longitude = location.getLongitude();
    latitude = location.getLatitude();
}