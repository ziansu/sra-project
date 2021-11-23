protected void addNearbyDevice(android.bluetooth.BluetoothDevice device) {
    if (!(hasPeer(device.getName()))) {
        nearbyDevices.add(device);
        registerRemoteDevice(device);
        android.util.Log.d(interdroid.swan.crossdevice.swanplus.bluetooth.BTManager.TAG, ("added new device " + (device.getName())));
    }else {
        android.util.Log.d(interdroid.swan.crossdevice.swanplus.bluetooth.BTManager.TAG, (("device " + (device.getName())) + " already present, won't add"));
    }
}