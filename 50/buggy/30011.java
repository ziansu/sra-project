public Device.Type type() {
    return get(org.onosproject.net.config.basics.BasicDeviceConfig.TYPE, Device.Type.SWITCH, Device.Type.class);
}