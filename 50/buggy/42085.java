@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        java.lang.Double lon = location.getLongitude();
        java.lang.Double lat = location.getLatitude();
    }
}