@java.lang.Override
protected void onDestroy() {
    unregisterReceiver(serviceStateReceiver);
    super.onDestroy();
}