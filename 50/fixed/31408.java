public void disabledInit() {
    if ((autonomousCommand) != null)
        autonomousCommand.cancel();
    
}