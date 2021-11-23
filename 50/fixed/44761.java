@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.i("GEOFENCE MONITORING", "onLocationChanged ");
    mLastLocation = location;
    tellFragmentLocationChanged();
}