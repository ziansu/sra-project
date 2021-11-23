@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    android.util.Log.d("GeofencesScanner.onConnectionFailed", "xxx");
    if (mResolvingError) {
        return ;
    }else
        if (connectionResult.hasResolution()) {
            showErrorNotification(connectionResult.getErrorCode());
            mResolvingError = true;
        }else {
            showErrorNotification(connectionResult.getErrorCode());
            mResolvingError = true;
        }
    
}