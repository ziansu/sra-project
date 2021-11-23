public void teleopInit() {
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
    teleopCommand.start();
    sonarTrigger.cancel();
}