@java.lang.Override
public void autonomousInit() {
    driveBase.resetGyro();
    driveBase.resetEncoders();
    activeMission = missionChooser.getSelected();
    if ((activeMission) != null) {
        activeMission.reset();
        java.lang.System.out.println((("Mission " + (activeMission.getID())) + " Started"));
    }
}