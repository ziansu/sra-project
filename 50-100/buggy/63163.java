@java.lang.Override
public void run() {
    java.lang.String DeviceAddress = device.getAddress().toString();
    android.bluetooth.BluetoothDevice mDevice = mScanDevice.get(DeviceAddress);
    if (((device.getName().indexOf(com.light.mbt.delight.UseDevicePageActivity.BLUETOOTH_DEVICE_NAME)) > (-1)) && (mDevice == null)) {
        mScanDevice.put(DeviceAddress, device);
        com.light.mbt.delight.CommonUtils.Logger.i(com.light.mbt.delight.UseDevicePageActivity.TAG, device.getAddress());
    }
}