private org.onosproject.net.DeviceId deviceId(java.lang.String dpid) {
    return org.onosproject.net.DeviceId.deviceId(java.net.URI.create(("of:" + dpid)));
}