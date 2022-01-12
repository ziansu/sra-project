void setWifiTetheringEnabled(boolean enable) {
    android.util.Log.d(jp.nemustech.instanthotspot.InstantHotSpotService.TAG, "setWifiTetheringEnabled");
    try {
        if (!(wifiManager.isWifiEnabled())) {
            wifiManager.setWifiEnabled(false);
        }
        android.net.wifi.WifiConfiguration config = ((android.net.wifi.WifiConfiguration) (getWifiApConfiguration.invoke(wifiManager)));
        setWifiApEnabled.invoke(wifiManager, config, enable);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}