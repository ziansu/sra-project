@java.lang.Override
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
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