@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    model.updateMap(mMap, mLastLocation);
}