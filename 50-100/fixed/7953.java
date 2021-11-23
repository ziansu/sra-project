protected void addNearbyDevice(android.bluetooth.BluetoothDevice device) {
    if (!(hasPeer(device.getName()))) {
        android.util.Log.d(interdroid.swan.crossdevice.swanplus.bluetooth.BTManager.TAG, ("added new device " + (device.getName())));
        nearbyDevices.add(device);
        registerRemoteDevice(device);
    }else {
        android.util.Log.d(interdroid.swan.crossdevice.swanplus.bluetooth.BTManager.TAG, (("device " + (device.getName())) + " already present, won't add"));
    }
}