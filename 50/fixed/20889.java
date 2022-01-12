@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((networkReceiver) != null) {
        this.unregisterReceiver(networkReceiver);
    }
}