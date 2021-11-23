@java.lang.SuppressWarnings(value = "unchecked")
public void connect(final android.bluetooth.BluetoothDevice device, final no.nordicsemi.android.log.ILogSession session) {
    no.nordicsemi.android.nrftoolbox.profile.BleManager<no.nordicsemi.android.nrftoolbox.profile.BleManagerCallbacks> manager = mBleManagers.get(device);
    if (manager != null) {
        if (!(manager.isConnected()))
            manager.connect(device);
        
    }else {
        mManagedDevices.add(device);
        mBleManagers.put(device, (manager = initializeManager()));
        manager.setGattCallbacks(this);
        manager.setLogger(session);
        manager.connect(device);
    }
}