@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    removeGroup();
    removePersistentGroups();
    removeService();
    removeServiceDiscoveryRequest();
    unregisterP2pReceiver();
    unregisterP2p();
    unregisterWifiReceiver();
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Wifi Handler service destroyed");
}