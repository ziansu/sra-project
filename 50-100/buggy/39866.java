@java.lang.Override
public void logout(int services) {
    mSignInClicked = false;
    if (((listener) != null) && ((listener.get()) != null)) {
        android.util.Log.e("SD", "C");
        listener.get().onStatusChanged(false, com.annahid.libs.artenus.unified.impl.GoogleLoginManager.LOGIN_MASK);
    }
    if (((mGoogleApiClient) != null) && (mGoogleApiClient.isConnected())) {
        com.google.android.gms.games.Games.signOut(mGoogleApiClient);
        mGoogleApiClient.reconnect();
    }
}