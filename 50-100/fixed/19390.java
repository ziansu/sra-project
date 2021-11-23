@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult connectionResult) {
    android.widget.Toast.makeText(getContext(), "An error has occurred.", Toast.LENGTH_SHORT).show();
    android.app.PendingIntent resolution = com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorResolutionPendingIntent(getContext(), connectionResult.getErrorCode(), com.firebase.ui.auth.util.signincontainer.SaveSmartLock.RC_UPDATE_SERVICE);
    try {
        mHelper.startIntentSenderForResult(resolution.getIntentSender(), com.firebase.ui.auth.util.signincontainer.SaveSmartLock.RC_UPDATE_SERVICE);
    } catch (android.content.IntentSender e) {
        android.util.Log.e(com.firebase.ui.auth.util.signincontainer.SaveSmartLock.TAG, "STATUS: Failed to send resolution.", e);
        finish();
    }
}