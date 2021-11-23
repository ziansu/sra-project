@java.lang.Override
public void deviceDataInfo(final gupuru.streetpassble.parcelable.DeviceData deviceData) {
    if ((onStreetPassBleServerListener) != null) {
        onStreetPassBleServerListener.onScanCallbackDeviceDataInfo(deviceData);
    }
}