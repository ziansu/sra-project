private int getNetworkId(android.net.wifi.WifiManager wifiManager, java.lang.String SSID) {
    java.util.List<android.net.wifi.WifiConfiguration> list = wifiManager.getConfiguredNetworks();
    if ((list == null) || ((list.size()) == 0))
        return -1;
    
    for (android.net.wifi.WifiConfiguration i : list) {
        if (((i.SSID) != null) && (i.SSID.equals((("\"" + SSID) + "\""))))
            return i.networkId;
        
    }
    return -1;
}