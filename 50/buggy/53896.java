@java.lang.Override
protected void onDestroy() {
    ls.quit();
    this.unregisterReceiver(receiver);
    this.unregisterReceiver(ir);
    super.onDestroy();
}