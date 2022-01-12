@java.lang.Override
public void check() {
    android.net.wifi.WifiManager wifiManager = ((android.net.wifi.WifiManager) (context.getApplicationContext().getSystemService(Context.WIFI_SERVICE)));
    android.net.wifi.WifiInfo wifiInfo = wifiManager.getConnectionInfo();
    if ((type) == (ryey.easer.commons.plugindef.eventplugin.EventType.is)) {
        changeSatisfiedState(compare(wifiInfo));
    }
    if ((type) == (ryey.easer.commons.plugindef.eventplugin.EventType.is_not)) {
        changeSatisfiedState((!(compare(wifiInfo))));
    }
}