@java.lang.Override
public void onPause() {
    if (((mGoogleAPIClient) != null) && (mGoogleAPIClient.isConnected())) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleAPIClient, this);
        Wearable.MessageApi.removeListener(mGoogleAPIClient, this);
        Wearable.DataApi.removeListener(mGoogleAPIClient, this);
        mGoogleAPIClient.disconnect();
    }
    super.onPause();
}