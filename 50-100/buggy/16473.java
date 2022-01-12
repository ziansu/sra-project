@java.lang.Override
public void onConnectionInfoAvailable(final android.net.wifi.p2p.WifiP2pInfo info) {
    android.util.Log.d(com.seniordesign.wolfpack.quizinator.WifiDirect.ConnectionService.TAG, ("onConnectionInfoAvailable: " + (info.groupOwnerAddress.getHostAddress())));
    if ((info.groupFormed) && (info.isGroupOwner)) {
    }else
        if (info.groupFormed) {
            wifiDirectApp.startSocketClient(info.groupOwnerAddress.getHostAddress());
        }
    
    wifiDirectApp.mP2pConnected = true;
    wifiDirectApp.mP2pInfo = info;
}