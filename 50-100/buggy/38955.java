@java.lang.Override
public void onClick(android.view.View view) {
    if (mGoogleApiClient.isConnected()) {
        curLatitude = mMap.getCameraPosition().target.latitude;
        curLongitude = mMap.getCameraPosition().target.longitude;
        mFragment.setLatLng(curLatitude, curLongitude);
        mFragment.onLocationChaged(curLatitude, curLongitude);
    }else {
    }
}