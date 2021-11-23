@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    removeServiceDiscoveryRequest();
    removeGroup();
    removePersistentGroups();
    removeService();
    unregisterP2pReceiver();
    unregisterP2p();
    unregisterWifiReceiver();
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Wifi Handler service destroyed");
}