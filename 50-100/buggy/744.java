@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    mMap.setMyLocationEnabled(true);
    android.util.Log.e("Maps/GoogleAp/conn", "Connection succ");
    mLastLocation = getCurrentLocation();
    setCameraFocus(mLastLocation);
    android.util.Log.e("Maps/googleAp/LaLo", (((java.lang.String.valueOf(mLastLocation.getLatitude())) + ", ") + (java.lang.String.valueOf(mLastLocation.getLongitude()))));
    startLocationUpdates();
    startGeofencing();
}