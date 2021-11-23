@java.lang.Override
public void onConnectionInfoAvailable(android.net.wifi.p2p.WifiP2pInfo info) {
    java.net.InetAddress groupOwnerAddress = info.groupOwnerAddress;
    ownerAddr = groupOwnerAddress;
    if ((info.groupFormed) && (info.isGroupOwner)) {
        isGroupeOwner = com.d2dsq.ui.WifiDirectBroadcastReceiver.IS_OWNER;
        android.os.Message msg1 = new android.os.Message();
        msg1.what = MainApplication.MSG_WIFI_SERVER;
        MainApplication.wifiMsgHandler.sendMessage(msg1);
    }else
        if (info.groupFormed) {
            isGroupeOwner = com.d2dsq.ui.WifiDirectBroadcastReceiver.IS_CLIENT;
            android.os.Message msg2 = new android.os.Message();
            msg2.what = MainApplication.MSG_WIFI_CLIENT;
            MainApplication.wifiMsgHandler.sendMessage(msg2);
        }
    
}