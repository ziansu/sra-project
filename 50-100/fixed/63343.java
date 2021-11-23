protected void execute() {
    Robot.chasis.move(Robot.oi.getRightSpeed(), Robot.oi.getLeftSpeed());
    if ((Robot.chasis.stafeSolenoid.get()) != (DoubleSolenoid.Value.kForward)) {
        Robot.chasis.chasisStrafe(Robot.oi.rightJoy.getX());
    }
}