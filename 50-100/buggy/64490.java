@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((isLoggedIn) && (locationUpdater.isRunning())) {
        locationUpdater.stop();
    }
    locationManager.removeUpdates(this);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(loginStatusReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(popupMessageReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(offersReceiver);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(vehicleStateReceiver);
}