@java.lang.Override
protected void onStop() {
    super.onStop();
    userHandler.cancelAllRequestWithTag(REQUSET_TAG);
    if (locationPermission) {
        unregisterReceiver(updateMapReceiver);
        unbindService(mConnection);
    }
}