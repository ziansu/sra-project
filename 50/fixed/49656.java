@java.lang.Override
public at.fhv.itm14.fhvgis.domain.Device mapDatabaseDevice(at.fhv.itm14.fhvgis.domain.Device dbDevice) {
    if (dbDevice == null) {
        return null;
    }
    at.fhv.itm14.fhvgis.domain.Device rv = new at.fhv.itm14.fhvgis.domain.Device(dbDevice.getId(), dbDevice.getToken(), dbDevice.getDeviceId());
    return rv;
}