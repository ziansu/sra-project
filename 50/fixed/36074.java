public void releaseAllDevices() throws com.musala.atmosphere.commons.cs.exception.DeviceNotFoundException {
    java.util.Set<com.musala.atmosphere.client.Device> devicesToRelease = new java.util.HashSet(deviceToDescriptor.keySet());
    for (com.musala.atmosphere.client.Device device : devicesToRelease) {
        releaseDevice(device);
    }
}