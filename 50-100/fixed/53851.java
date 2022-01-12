private void resolveSignInError() {
    if (((mConnectionResult) != null) && (mConnectionResult.hasResolution())) {
        try {
            mIntentInProgress = true;
            startIntentSenderForResult(mConnectionResult.getResolution().getIntentSender(), Constants.SIGN_IN_REQUEST, null, 0, 0, 0);
        } catch (android.content.IntentSender e) {
            mIntentInProgress = false;
            mGoogleApiClient.connect();
        }
    }
}