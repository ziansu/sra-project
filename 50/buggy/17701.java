@java.lang.Override
public void disabledInit() {
    org.usfirst.frc.team2175.robot.Robot.containerElevator.containerElevatorController.disable();
    try {
        org.usfirst.frc.team2175.robot.Robot.pdpLogger.endPDPLogging();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}