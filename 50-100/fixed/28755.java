public static android.net.wifi.WifiConfiguration generateWifiConfig(int networkId, int uid, java.lang.String ssid, boolean shared, boolean enabled, java.lang.String fqdn, java.lang.String providerFriendlyName) {
    final android.net.wifi.WifiConfiguration config = new android.net.wifi.WifiConfiguration();
    config.SSID = ssid;
    config.networkId = networkId;
    config.creatorUid = uid;
    config.shared = shared;
    config.status = (enabled) ? WifiConfiguration.Status.ENABLED : WifiConfiguration.Status.DISABLED;
    config.FQDN = fqdn;
    config.providerFriendlyName = providerFriendlyName;
    return config;
}