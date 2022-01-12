public java.util.List<device.Device> getDevices() {
    if (devices.isEmpty()) {
        updateDeviceList();
        return devices.isEmpty() ? java.util.Collections.emptyList() : new java.util.ArrayList(devices);
    }else {
        return new java.util.ArrayList(devices);
    }
}