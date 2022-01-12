private void resolveSignInError() {
    if (!(mSilent)) {
        if (mConnectionResult.hasResolution()) {
            try {
                mIntentInProgress = true;
                mConnectionResult.startResolutionForResult(mActivity, se.devscout.android.util.auth.GoogleAuthenticationStrategy.RC_SIGN_IN);
            } catch (android.content.IntentSender e) {
                mIntentInProgress = false;
                mGoogleApiClient.connect();
            }
        }
    }else {
        se.devscout.android.util.LogUtil.e(se.devscout.android.util.auth.GoogleAuthenticationStrategy.class.getName(), "Will not handle sign-in error since silent=true.");
    }
}