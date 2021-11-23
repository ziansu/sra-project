public static void setSdpInitiatedAddress(android.bluetooth.BluetoothDevice remBtDev) {
    if (remBtDev != null)
        com.android.bluetooth.OolConnManager.mAddress = remBtDev.getAddress();
    else
        com.android.bluetooth.OolConnManager.mAddress = null;
    
    android.util.Log.d(com.android.bluetooth.OolConnManager.TAG, ("setSdpInitiatedAddress " + (com.android.bluetooth.OolConnManager.mAddress)));
}