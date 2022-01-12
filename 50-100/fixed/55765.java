public static ch.projecthelin.droneonboardapp.dto.dronestate.GPSState getGPSState(com.o3dr.services.android.lib.drone.property.Gps gps) {
    ch.projecthelin.droneonboardapp.dto.dronestate.GPSState gpsState = new ch.projecthelin.droneonboardapp.dto.dronestate.GPSState();
    if (gps != null) {
        gpsState.setFixType(gps.getFixType());
        gpsState.setSatellitesCount(gps.getSatellitesCount());
        gpsState.setPosition(gps.getPosition());
    }
    return gpsState;
}