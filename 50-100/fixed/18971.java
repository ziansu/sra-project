@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    int state = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);
    if ((action.equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) && ((state == (android.net.wifi.WifiManager.WIFI_STATE_DISABLED)) || (state == (android.net.wifi.WifiManager.WIFI_STATE_UNKNOWN)))) {
    }else
        if (action.equals(ConnectStateManager.ACTION_CONNECT_STATE_CHANGED)) {
            com.vmc.ipc.util.DebugHandler.logd(com.hexairbot.hexmini.MainExActivity.TAG, ConnectStateManager.ACTION_CONNECT_STATE_CHANGED);
        }
    
}