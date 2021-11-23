public java.lang.String p2pDeviceToString(android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice) {
    if (wifiP2pDevice != null) {
        java.lang.String strDevice = "Device name: " + (wifiP2pDevice.deviceName);
        strDevice += "\nDevice address: " + (wifiP2pDevice.deviceAddress);
        strDevice += "\nIs group owner: " + (isGroupOwner());
        strDevice += ("\nStatus: " + (deviceStatusToString(wifiP2pDevice.status))) + "\n";
        return strDevice;
    }else {
        android.util.Log.e(edu.rit.se.wifibuddy.WifiDirectHandler.TAG, "WifiP2pDevice is null");
        return "";
    }
}