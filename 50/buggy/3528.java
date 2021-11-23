@java.lang.Override
public void run() {
    if (checkNIDBLEFilter(device.getName()))
        addDevice(getBtDeviceSpec(device, false, rssi));
    
}