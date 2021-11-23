@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    latitude = location.getLatitude();
    longitude = location.getLongitude();
    android.util.Log.d("test", java.lang.String.valueOf(latitude));
}