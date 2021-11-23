protected void execute() {
    if ((!(boulderFired)) && ((timer.get()) >= (org.usfirst.frc.team6179.robot.configurations.ShooterConfig.shooterTriggerDelay))) {
        Robot.instance.shooter.triggerServo.setAngle(ShooterConfig.triggerServoForwardPosition);
        timer.reset();
        boulderFired = true;
    }
}