@java.lang.Override
public void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
    android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Group info available");
    if (wifiP2pGroup != null) {
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "WifiP2pGroup:");
        android.util.Log.i(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, p2pGroupToString(wifiP2pGroup));
        isGroupOwner = wifiP2pGroup.isGroupOwner();
        groupFormed = true;
    }else {
        android.util.Log.w(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "Group is null");
    }
}