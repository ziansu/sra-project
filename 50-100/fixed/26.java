public void signOutFromGplus() {
    if (mGoogleApiClient.isConnected()) {
        if ((com.parse.ParseUser.getCurrentUser()) != null) {
            com.parse.ParseUser.logOut();
        }
        Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
        mGoogleApiClient.disconnect();
        mGoogleApiClient.connect();
        updateUI(false);
    }
}