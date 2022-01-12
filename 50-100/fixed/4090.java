@java.lang.Override
protected android.bluetooth.BluetoothDevice doInBackground(java.lang.String... params) {
    try {
        java.lang.Thread.sleep(10000);
        stopDiscoveryOfDevices();
        if ((devices) != null) {
            for (android.bluetooth.BluetoothDevice device : devices) {
                if (device.getAddress().contains(params[0])) {
                    deviceFound = true;
                    targetDevice = device;
                    android.util.Log.d(com.alejandro_castilla.cloudfitforwear.services.bluetooth.BluetoothService.TAG, "The device requested has been found.");
                }
            }
        }
        return targetDevice;
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return null;
}