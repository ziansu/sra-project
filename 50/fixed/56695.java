@java.lang.Override
protected void onStop() {
    unregisterReceiver(playerReceiver);
    super.onStop();
}