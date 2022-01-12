protected void initialize() {
    Robot.logger.log("Initialize", 1);
    Robot.driveTrain.resetEncoders();
    finished = false;
    Robot.shooterArm.setPosition(startPot);
    timer.reset();
    timer.start();
}