@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mMap.clear();
    showLocation(location);
}