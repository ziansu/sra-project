private com.o3dr.services.android.lib.drone.connection.ConnectionParameter checkConnectionParameter(com.o3dr.services.android.lib.drone.connection.ConnectionParameter connParams) throws org.droidplanner.services.android.impl.exception.ConnectionException {
    if (connParams == null) {
        throw new org.droidplanner.services.android.impl.exception.ConnectionException("Invalid connection parameters");
    }
    if (org.droidplanner.services.android.impl.communication.connection.SoloConnection.isUdpSoloConnection(context, connParams)) {
        com.o3dr.services.android.lib.drone.connection.ConnectionParameter update = org.droidplanner.services.android.impl.communication.connection.SoloConnection.getSoloConnectionParameterFromUdp(context, connParams.getTLogLoggingUri());
        if (update != null) {
            return update;
        }
    }
    return connParams;
}