@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(getActivity(), ("Could not connect to Google API Client: Error " + (connectionResult.getErrorCode())), Toast.LENGTH_SHORT).show();
}