public void onSignInClick(android.view.View view) {
    if (!(googleApiClient.isConnecting())) {
        resolveSignInError();
    }
}