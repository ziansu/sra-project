@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(connectionSuccessReceiver);
    if ((refreshedTokenReceiver) != null)
        unregisterReceiver(refreshedTokenReceiver);
    
}