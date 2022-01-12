@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    super.onVisibilityChanged(visible);
    if (visible) {
        registerReceiver();
        mTime.clear(java.util.TimeZone.getDefault().getID());
        mTime.setToNow();
        mGoogleApiClient.connect();
    }else {
        unregisterReceiver();
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }
    updateTimer();
}