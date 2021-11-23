@java.lang.Override
protected void initialize() {
    Robot.instance.climber.lockServo.set(ClimberConfig.lockServoLockPosition);
}