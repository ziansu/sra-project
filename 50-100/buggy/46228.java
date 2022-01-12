public java.util.List<device.Device> getDevices() {
    if (devices.isEmpty()) {
        updateDeviceList();
        return devices.isEmpty() ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(devices);
    }else {
        return java.util.Collections.unmodifiableList(devices);
    }
}