public static android.net.wifi.WifiConfiguration createEapNetwork() {
    android.net.wifi.WifiConfiguration configuration = com.android.server.wifi.WifiConfigurationTestUtil.generateWifiConfig(com.android.server.wifi.WifiConfigurationTestUtil.TEST_NETWORK_ID, com.android.server.wifi.WifiConfigurationTestUtil.TEST_UID, com.android.server.wifi.WifiConfigurationTestUtil.createNewSSID(), true, true, null, null, com.android.server.wifi.WifiConfigurationTestUtil.SECURITY_EAP);
    return configuration;
}