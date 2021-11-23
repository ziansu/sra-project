public void discoverDeviceServices(java.lang.String address) {
    if (((mConnectedDevice) != null) && (mConnectedDevice.containsKey(address))) {
        mConnectedDevice.get(address).discoverDeviceServices();
    }
}