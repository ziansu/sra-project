public void register(android.content.Context mContext) {
    this.mContext = mContext;
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
    intentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
    intentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);
    mContext.registerReceiver(this, intentFilter);
}