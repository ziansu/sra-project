protected void execute() {
    if ((!(boulderFired)) && ((timer.get()) >= (org.usfirst.frc.team6179.robot.configurations.ShooterConfig.shooterTriggerDelay))) {
        Robot.instance.shooter.triggerServo.set(ShooterConfig.triggerServoForwardPosition);
        timer.reset();
        boulderFired = true;
    }
}