protected void execute() {
    boolean fast = false;
    double speedEdit = (java.lang.Math.abs(((Robot.oi.driver.getRawAxis(3)) + 1))) / 2;
    RobotMap.robotDrive.arcadeDrive(((Robot.oi.driver.getRawAxis(1)) * speedEdit), ((Robot.oi.driver.getRawAxis(0)) * speedEdit));
}