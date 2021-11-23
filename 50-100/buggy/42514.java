@java.lang.Override
public void teleopInit() {
    if ((autonomousCommand) != null) {
        autonomousCommand.cancel();
    }
    driveChoice = ((edu.wpi.first.wpilibj.command.Command) (driveChooser.getSelected()));
    driveChoice.start();
    java.lang.System.out.println("iaminteleop");
    smartDashboardUpdate();
    try {
        org.usfirst.frc.team2175.robot.Robot.pdpLogger.initPDPLogging();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}