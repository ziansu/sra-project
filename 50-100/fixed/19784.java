@java.lang.Override
public void run() {
    final boolean discover = (((bluetoothAdapter != null) && (bluetoothAdapter.isEnabled())) && (!(bluetoothAdapter.isDiscovering()))) && (!(isDeviceConnected.get()));
    if (discover)
        bluetoothAdapter.startDiscovery();
    
}