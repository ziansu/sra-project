@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((this.getClass()) != (obj.getClass())) {
        return false;
    }
    ch.unige.pinfo.device.dom.Device device = ((ch.unige.pinfo.device.dom.Device) (obj));
    return (this.getDeviceId().equals(device.deviceId)) && (this.getType().equals(device.type));
}