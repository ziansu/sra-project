@java.lang.Override
public void teleopInit() {
    new org.usfirst.frc.team2175.control.JoystickEventMapper();
    if (((auton) != null) && (auton.isRunning())) {
        auton.cancel();
    }
    drivetrainSubsystem.resetSensors();
}