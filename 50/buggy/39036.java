@java.lang.Override
public void deviceDataInfo(gupuru.streetpassble.parcelable.DeviceData deviceData) {
    if ((onStreetPassBleListener) != null) {
        onStreetPassBleListener.nearByDevices(deviceData);
    }
    if ((onStreetPassBleServerListener) != null) {
        onStreetPassBleServerListener.onScanCallbackDeviceDataInfo(deviceData);
    }
}