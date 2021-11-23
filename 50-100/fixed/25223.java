private void removeMotor() {
    net.sf.openrocket.rocketcomponent.MotorMount curMount = getSelectedComponent();
    net.sf.openrocket.rocketcomponent.FlightConfigurationID fcid = getSelectedConfigurationId();
    if ((null == fcid) || (null == curMount)) {
        return ;
    }
    curMount.setMotorInstance(fcid, null);
    fireTableDataChanged();
}