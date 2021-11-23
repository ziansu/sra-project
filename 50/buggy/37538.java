@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mLastLocation = location;
    handleNewLocation(location);
    android.util.Log.d(com.agusgarcia.geonotes.MapFragment.TAG, ("onLocationChanged" + (mLastLocation.toString())));
}