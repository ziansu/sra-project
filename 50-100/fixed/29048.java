@java.lang.Override
public void wfdEstablished(android.net.wifi.p2p.WifiP2pInfo p2pInfo) {
    if ((p2pInfo.groupOwnerAddress) == null) {
        return ;
    }
    java.lang.String brokerIp = p2pInfo.groupOwnerAddress.getHostAddress();
    if ((p2pInfo.groupFormed) && (p2pInfo.isGroupOwner)) {
        if ((mBroker) != null) {
            mainHandler.obtainMessage(Utils.MESSAGE_INFO, "broker reused").sendToTarget();
            return ;
        }
    }else
        if (p2pInfo.groupFormed) {
        }
    
}