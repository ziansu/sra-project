public void teleopInit() {
    drive.disableLeftPIDControl();
    drive.disableRightPIDControl();
    binElevator.resetEncoder();
    binElevator.disablePID();
    binElevatorPID.setPID(VariableMap.BIN_ELEVATOR_PID_P, VariableMap.BIN_ELEVATOR_PID_I, VariableMap.BIN_ELEVATOR_PID_D);
}