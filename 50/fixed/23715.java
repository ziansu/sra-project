public static boolean createBond(android.bluetooth.BluetoothDevice device) {
    if (io.relayr.ble.DeviceCompatibilityUtils.isSdk19())
        return io.relayr.ble.DeviceCompatibilityUtils.doCreateBond(device);
    
    return io.relayr.ble.DeviceCompatibilityUtils.callMethod(device, "createBond");
}