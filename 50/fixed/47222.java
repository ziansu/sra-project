public void teleopInit() {
    if ((autonomousCommand) != null) {
        autonomousCommand.cancel();
    }
    if ((sonarTrigger) != null) {
        sonarTrigger.cancel();
    }
    teleopCommand.start();
}