public void onSignInClick(android.view.View view) {
    if (!(googleApiClient.isConnecting())) {
        textViewStatus.setText("Signing in");
        resolveSignInError();
    }
}