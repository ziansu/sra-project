protected void execute() {
    if (pilotController.getIsXbox()) {
        Robot.drivetrain.arcadeDrive(pilotController.getRawAxis(1), pilotController.getRawAxis(4), 1.0);
    }else {
        Robot.drivetrain.arcadeDrive(pilotController.getY(), pilotController.getTwist(), ((pilotController.getThrottle()) + 0.5));
    }
}