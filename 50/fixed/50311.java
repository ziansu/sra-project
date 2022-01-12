@java.lang.Override
protected void onStop() {
    super.onStop();
    unregisterReceiver(wifiStateChangeReceiver);
    if ((task) != null) {
        task.cancel(true);
    }
}