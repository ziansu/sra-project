protected void execute() {
    int leftEnc = java.lang.Math.abs(Robot.driveTrain.getLeftEncoder());
    int rightEnc = java.lang.Math.abs(Robot.driveTrain.getRightEncoder());
    if ((leftEnc > (encTarget)) || (rightEnc > (encTarget))) {
        Robot.shooterArm.setPosition(potValue);
        finished = true;
    }
}