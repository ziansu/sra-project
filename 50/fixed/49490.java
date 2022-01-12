@java.lang.Override
protected void onStart() {
    super.onStart();
    com.irccloud.android.BackgroundTaskService.cancelBacklogSync(this);
    if (!(mResolvingError)) {
        mGoogleApiClient.connect();
    }
}