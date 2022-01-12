private void setPairingLevel(com.connectsdk.discovery.DiscoveryManager.PairingLevel level) {
    com.connectsdk.discovery.DiscoveryManager.init(Robolectric.application);
    com.connectsdk.discovery.DiscoveryManager.getInstance().setPairingLevel(level);
}