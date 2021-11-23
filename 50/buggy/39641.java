@java.lang.Override
public void onPause() {
    super.onPause();
    if (mGoogleApiClient.isConnected()) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }
    mGoogleApiClient.stopAutoManage(getActivity());
    mGoogleApiClient.disconnect();
}