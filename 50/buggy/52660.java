@java.lang.Override
protected void initialize() {
    Robot.instance.climber.lockServo.setAngle(ClimberConfig.lockServoLockPosition);
}