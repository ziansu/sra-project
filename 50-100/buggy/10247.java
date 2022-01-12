@java.lang.Override
public void onConnected(final android.bluetooth.BluetoothDevice device) {
    mLogger.fine((("HeartRateConnectEventListener#onConnected: [" + device) + "]"));
    org.deviceconnect.android.deviceplugin.heartrate.data.HeartRateDevice hr = findRegisteredHeartRateDeviceByAddress(device.getAddress());
    if (hr == null) {
        hr = registerHeartRateDevice(device);
    }else {
        hr.setConnectFlag(true);
    }
    mConnectedDevices.add(hr);
    if ((mHRDiscoveryListener) != null) {
        mHRDiscoveryListener.onConnected(device);
    }
}