@java.lang.Override
protected void shiftGear(org.usfirst.frc.team1076.robot.physical.GearStates newState, org.usfirst.frc.team1076.robot.IRobot robot) {
    currentGear = newState;
    if (newState == (GearStates.High)) {
        robot.setGear(SolenoidValue.Forward);
    }else
        if (newState == (GearStates.Low)) {
            robot.setGear(SolenoidValue.Reverse);
        }
    
}