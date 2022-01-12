@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    if (connectionResult.hasResolution()) {
        try {
            connectionResult.startResolutionForResult(mCordova.getActivity(), LocationUtils.CONNECTION_FAILURE_RESOLUTION_REQUEST);
        } catch (android.content.IntentSender e) {
            e.printStackTrace();
        }
    }else {
        showErrorDialog(connectionResult.getErrorCode(), LocationUtils.CONNECTION_FAILURE_RESOLUTION_REQUEST);
    }
}