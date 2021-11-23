@java.lang.Override
public void teleopInit() {
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
    myRobot.setSafetyEnabled(false);
}