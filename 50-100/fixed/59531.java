@java.lang.SuppressWarnings(value = "unchecked")
public void connect(final android.bluetooth.BluetoothDevice device, final no.nordicsemi.android.log.ILogSession session) {
    if (mManagedDevices.contains(device))
        return ;
    
    mManagedDevices.add(device);
    no.nordicsemi.android.nrftoolbox.profile.BleManager<no.nordicsemi.android.nrftoolbox.profile.BleManagerCallbacks> manager = mBleManagers.get(device);
    if (manager != null) {
        manager.connect(device);
    }else {
        mBleManagers.put(device, (manager = initializeManager()));
        manager.setGattCallbacks(this);
        manager.setLogger(session);
        manager.connect(device);
    }
}