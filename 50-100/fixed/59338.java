void handlePreDhcpSetup() {
    mDhcpActive = true;
    if (!(mBluetoothConnectionActive)) {
        mWifiNative.setBluetoothCoexistenceMode(mWifiNative.BLUETOOTH_COEXISTENCE_MODE_DISABLED);
    }
    setSuspendOptimizationsNative(com.android.server.wifi.WifiStateMachine.SUSPEND_DUE_TO_DHCP, false);
    mWifiNative.setPowerSave(false);
    com.android.server.wifi.WifiNative.pauseScan();
    getWifiLinkLayerStats(false);
    android.os.Message msg = new android.os.Message();
    msg.what = com.android.server.wifi.p2p.WifiP2pServiceImpl.BLOCK_DISCOVERY;
    msg.arg1 = com.android.server.wifi.p2p.WifiP2pServiceImpl.ENABLED;
    msg.arg2 = android.net.DhcpStateMachine.CMD_PRE_DHCP_ACTION_COMPLETE;
    msg.obj = mDhcpStateMachine;
    mWifiP2pChannel.sendMessage(msg);
}