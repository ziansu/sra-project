private java.lang.Long getDeviceIdByDeviceTypeId(int deviceTypeId) {
    java.lang.String deviceType = null;
    switch (deviceTypeId) {
        case 1 :
            deviceType = "WATER";
            break;
        case 2 :
            deviceType = "THERMAL";
            break;
    }
    return deviceService.getByDeviceTypeAndDefaultDevice(deviceType, true).getId();
}