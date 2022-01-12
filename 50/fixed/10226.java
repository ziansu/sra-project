@java.lang.Override
protected void onPause() {
    super.onPause();
    unregisterReceiver(downloadReceiver);
}