protected void discoveredDevice(java.lang.String deviceInfo, net.dankito.sync.devices.DiscoveredDevice device) {
    synchronized(discoveredDevices) {
        discoveredDevices.put(deviceInfo, device);
        net.dankito.sync.devices.DiscoveredDeviceType type = determineDiscoveredDeviceType(device);
        if (type == (DiscoveredDeviceType.KNOWN_SYNCHRONIZED_DEVICE)) {
            knownSynchronizedDevices.put(deviceInfo, device);
            callKnownSynchronizedDeviceConnected(device);
        }else
            if (type == (DiscoveredDeviceType.KNOWN_IGNORED_DEVICE)) {
                knownIgnoredDevices.put(deviceInfo, device);
            }else {
                unknownDevices.put(deviceInfo, device);
            }
        
        callDiscoveredDeviceConnectedListeners(device, type);
    }
}