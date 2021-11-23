private iot.agile.Device getDevice(iot.agile.object.DeviceDefinition devDef) {
    java.lang.String objectName = "iot.agile.Device";
    java.lang.String objectPath = ("/iot/agile/Device/" + (devDef.getProtocol().replace("iot.agile.protocol.", "").toLowerCase())) + (devDef.address.replace(":", ""));
    try {
        iot.agile.Device device = ((iot.agile.Device) (connection.getRemoteObject(objectName, objectPath)));
        return device;
    } catch (java.lang.Exception e) {
        return null;
    }
}