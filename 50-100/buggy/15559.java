private void addDevice(android.bluetooth.BluetoothDevice device, int rssi) {
    if (!(mLeDevices.contains(device))) {
        mLeDevices.add(device);
        mLeDevices_rssi.put(device, rssi);
        DeviceFound();
    }else {
        mLeDevices_rssi.put(device, rssi);
    }
    RssiChanged();
}