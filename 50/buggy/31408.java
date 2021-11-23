public void disabledInit() {
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
    if ((teleopCommand) != null)
        teleopCommand.cancel();
    
}