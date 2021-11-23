public void onLocationAllowed() {
    getActivity().startService(new android.content.Intent(getActivity(), com.example.alex.motoproject.services.LocationListenerService.class));
    try {
        getActivity().unregisterReceiver(mNetworkStateReceiver);
    } catch (java.lang.IllegalArgumentException e) {
        android.util.Log.v(com.example.alex.motoproject.fragments.MapFragment.LOG_TAG, "mNetworkReceiver has already been unregistered");
    }
    if (checkLocationPermission()) {
        mMap.setMyLocationEnabled(true);
    }
}