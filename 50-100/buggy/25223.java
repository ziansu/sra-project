private void removeMotor() {
    net.sf.openrocket.rocketcomponent.MotorMount curMount = getSelectedComponent();
    net.sf.openrocket.rocketcomponent.FlightConfigurationID fcid = getSelectedConfigurationId();
    if ((null == fcid) || (null == curMount)) {
        return ;
    }
    net.sf.openrocket.motor.MotorInstance curInstance = net.sf.openrocket.motor.MotorInstance.EMPTY_INSTANCE;
    curMount.setMotorInstance(fcid, curInstance);
    fireTableDataChanged();
}