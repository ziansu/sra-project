@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)) {
        android.net.NetworkInfo networkInfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
        if ((networkInfo.getState()) == (NetworkInfo.State.CONNECTED)) {
            android.net.wifi.WifiInfo wifiInfo = intent.getParcelableExtra(WifiManager.EXTRA_WIFI_INFO);
            if ((type) == (ryey.easer.commons.plugindef.eventplugin.EventType.is))
                changeSatisfiedState(compare(wifiInfo));
            
        }
    }
}