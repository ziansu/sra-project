@java.lang.Override
protected void onStop() {
    unregisterReceiver(broadcastReceiver);
    super.onStop();
}