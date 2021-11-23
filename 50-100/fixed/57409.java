public java.lang.String checkEduroamAnon() {
    java.lang.String message = "";
    if (wifi.isWifiEnabled()) {
        currentConfigs = wifi.getConfiguredNetworks();
        if ((currentConfigs) != null)
            for (android.net.wifi.WifiConfiguration currentConfig : currentConfigs) {
                if (currentConfig.SSID.equals("\"eduroam\"")) {
                    if ((currentConfig.enterpriseConfig.getAnonymousIdentity().length()) > 0)
                        message += ("Anon ID=<font color=\"black\">" + (currentConfig.enterpriseConfig.getAnonymousIdentity())) + "</font>";
                    else
                        message += "<font color=\"#000000\">Anon ID missing (optional)</font>";
                    
                }
            }
        
    }
    return message;
}