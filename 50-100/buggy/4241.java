@android.support.annotation.Nullable
private org.chromium.ChromeBluetoothLowEnergy.ChromeBluetoothLowEnergyPeripheral getPeripheralByDeviceAddress(java.lang.String deviceAddress) {
    org.chromium.ChromeBluetoothLowEnergy.ChromeBluetoothLowEnergyPeripheral peripheral = knownPeripheral.get(deviceAddress);
    if (peripheral != null)
        return peripheral;
    
    org.chromium.ChromeBluetooth bluetoothPlugin = ((org.chromium.ChromeBluetooth) (webView.getPluginManager().getPlugin("ChromeBluetooth")));
    org.uribeacon.scan.compat.ScanResult bleScanResult = bluetoothPlugin.getKnownLeScanResults(deviceAddress);
    if (bleScanResult == null)
        return null;
    
    peripheral = new org.chromium.ChromeBluetoothLowEnergy.ChromeBluetoothLowEnergyPeripheral(bleScanResult);
    knownPeripheral.put(deviceAddress, peripheral);
    return peripheral;
}