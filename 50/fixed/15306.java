@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unbinder.unbind();
    if ((connectivityChangeReceiver) != null)
        unregisterReceiver(connectivityChangeReceiver);
    
}