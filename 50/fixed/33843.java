private static com.o3dr.services.android.lib.drone.property.Type.Firmware getTypeFirmware(int droneType) {
    switch (droneType) {
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_COPTER :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.ARDU_COPTER;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_PLANE :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.ARDU_PLANE;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_ROVER :
            return com.o3dr.services.android.lib.drone.property.Type.Firmware.APM_ROVER;
        case com.o3dr.services.android.lib.drone.property.Type.TYPE_UNKNOWN :
        default :
            return null;
    }
}