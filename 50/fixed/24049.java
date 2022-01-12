@java.lang.Override
protected void onStart() {
    mPlayPresenter.connectGoogleApiClient();
    super.onStart();
}