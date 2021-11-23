private void resolveSignInError() {
    if (mConnectionResult.hasResolution()) {
        try {
            mIntentInProgress = true;
            mConnectionResult.startResolutionForResult(mActivity, se.devscout.android.util.auth.GoogleAuthenticationStrategy.RC_SIGN_IN);
        } catch (android.content.IntentSender e) {
            mIntentInProgress = false;
            mGoogleApiClient.connect();
        }
    }
}