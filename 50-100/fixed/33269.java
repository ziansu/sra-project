public void onLocationAllowed() {
    getContext().startService(new android.content.Intent(getContext(), com.example.alex.motoproject.services.LocationListenerService.class));
    try {
        getContext().unregisterReceiver(mNetworkStateReceiver);
    } catch (java.lang.IllegalArgumentException e) {
        android.util.Log.v(com.example.alex.motoproject.fragments.MapFragment.LOG_TAG, "mNetworkReceiver has already been unregistered");
    }
    if (checkLocationPermission()) {
        mMap.setMyLocationEnabled(true);
    }
}