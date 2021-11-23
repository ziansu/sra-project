private void connectToGoogleClientAPIandSendMessage() {
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
        android.widget.Toast.makeText(this, "connecting", Toast.LENGTH_SHORT).show();
    }
}