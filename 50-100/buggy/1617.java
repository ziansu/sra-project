public static void setIpAssignment(java.lang.String assign, android.net.wifi.WifiConfiguration wifiConf) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        java.lang.Object ipConfiguration = wifiConf.getClass().getMethod("getIpConfiguration").invoke(wifiConf);
        personal.gino.dnsmasq.DNSWidget.setEnumField(ipConfiguration, assign, "ipAssignment");
    }else {
        personal.gino.dnsmasq.DNSWidget.setEnumField(wifiConf, assign, "ipAssignment");
    }
}