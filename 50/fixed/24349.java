@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((wifiStateChangeReceiver) != null) {
        unregisterReceiver(wifiStateChangeReceiver);
    }
    if ((task) != null) {
        task.cancel(true);
    }
}