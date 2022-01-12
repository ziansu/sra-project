public void commBusDataArrived() {
    hu.nik.project.wheels.WheelsMessagePackage msgPacket;
    java.lang.Class wheelMessagePacket = _commBusConnector.getDataType();
    if (wheelMessagePacket == (hu.nik.project.wheels.WheelsMessagePackage.class)) {
        try {
            msgPacket = ((hu.nik.project.wheels.WheelsMessagePackage) (_commBusConnector.receive()));
            if (msgPacket != null) {
                _currentSpeed = msgPacket.speed;
            }
        } catch (hu.nik.project.radar.CommBusException e) {
            e.printStackTrace();
        }
    }
}