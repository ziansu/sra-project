public com.mobilyzer.DeviceInfo getDeviceInfo() {
    if ((deviceInfo) == null) {
        deviceInfo = new com.mobilyzer.DeviceInfo();
        deviceInfo.deviceId = getDeviceId();
        deviceInfo.manufacturer = android.os.Build.MANUFACTURER;
        deviceInfo.model = android.os.Build.MODEL;
        deviceInfo.os = getVersionStr();
        deviceInfo.user = Build.VERSION.CODENAME;
        deviceInfo.cpu_race = getCpuRace();
        deviceInfo.memory_race = getMemoryRace();
        deviceInfo.network_race = getNetworkRace();
    }
    return deviceInfo;
}