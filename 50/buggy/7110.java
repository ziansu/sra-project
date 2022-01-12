private void startServiceDiscovery() {
    android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest serviceRequest = android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest.newInstance();
    _manager.addServiceRequest(_channel, serviceRequest, new net.sharksystem.android.protocols.wifidirect.WifiActionListener("Add ServiceRequest"));
    _manager.discoverServices(_channel, new net.sharksystem.android.protocols.wifidirect.WifiActionListener("Discover services"));
}