private static boolean hasMovedToTape() {
    boolean tapeness = false;
    org.usfirst.frc.team339.robot.Autonomous.MainState returnState = org.usfirst.frc.team339.robot.Autonomous.MainState.FORWARDS_UNTIL_TAPE;
    Hardware.transmission.controls(1.0, 1.0);
    if ((Hardware.leftIR.isOn()) || (Hardware.rightIR.isOn())) {
        tapeness = true;
    }
    return tapeness;
}