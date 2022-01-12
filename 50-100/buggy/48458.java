private org.jboss.arquillian.android.api.AndroidDevice checkIfRealDeviceIsConnected(org.jboss.arquillian.android.api.AndroidBridge bridge, java.lang.String serialId) {
    if ((serialId == null) || ((serialId.length()) > 0)) {
        return null;
    }
    for (org.jboss.arquillian.android.api.AndroidDevice device : bridge.getDevices()) {
        if (serialId.equals(device.getSerialNumber())) {
            return device;
        }
    }
    org.jboss.arquillian.android.impl.AndroidDeviceSelector.log.warning((("SerialId " + serialId) + " was specified, however no such device was connected. Trying to connect to an emulator instead."));
    return null;
}