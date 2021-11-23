@java.lang.Override
protected void execute() {
    if (Robot.intakeLauncher.canLaunch()) {
        Robot.intakeLauncher.setDesiredWheelSpeed();
    }
}