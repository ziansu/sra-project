@java.lang.Override
public boolean equals(java.lang.Object obj) {
    ch.unige.pinfo.device.dom.Device device = ((ch.unige.pinfo.device.dom.Device) (obj));
    if (device == null)
        return false;
    
    return (this.getDeviceId().equals(device.deviceId)) && (this.getType().equals(device.type));
}