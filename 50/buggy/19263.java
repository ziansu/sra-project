@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/")
public javax.ws.rs.core.Response createFirmware(org.mycontroller.standalone.db.tables.Firmware firmware) {
    org.mycontroller.standalone.mysensors.firmware.FirmwareUtils.updateFirmwareFromHexString(firmware);
    firmware.setTimestamp(java.lang.System.currentTimeMillis());
    org.mycontroller.standalone.db.DaoUtils.getFirmwareDao().create(firmware);
    return org.mycontroller.standalone.api.jaxrs.utils.RestUtils.getResponse(Status.CREATED);
}