@java.lang.Override
public void onSignOutClicked() {
    if (mGoogleApiClient.isConnected()) {
        mFirstTimeSignIn = false;
        Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
        Plus.AccountApi.revokeAccessAndDisconnect(mGoogleApiClient);
        mGoogleApiClient.disconnect();
    }
}