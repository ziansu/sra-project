@java.lang.Override
protected void onDestroy() {
    if ((ls) != null)
        ls.quit();
    
    this.unregisterReceiver(receiver);
    this.unregisterReceiver(ir);
    super.onDestroy();
}