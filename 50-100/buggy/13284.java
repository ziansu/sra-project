@java.lang.Override
public void onConnectionFailed(@android.support.annotation.NonNull
com.google.android.gms.common.ConnectionResult result) {
    mSignedIn = false;
    mConnecting = false;
    android.util.Log.w(com.sam.hex.Settings.TAG, java.lang.String.format("Connection failed: %s", com.sam.hex.BaseGameActivity.toString(result)));
    if (result.hasResolution()) {
        android.util.Log.v(com.sam.hex.Settings.TAG, "Resolution is available");
        mConnectionResult = result;
        beginUserInitiatedSignIn();
    }
    onSignInFailed();
}