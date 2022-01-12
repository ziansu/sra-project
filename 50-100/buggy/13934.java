protected void execute() {
    int leftEnc = Robot.driveTrain.getLeftEncoder();
    int rightEnc = Robot.driveTrain.getRightEncoder();
    if ((leftEnc > (encTarget)) || (rightEnc > (encTarget))) {
        Robot.shooterArm.setPosition(potValue);
        finished = true;
    }
}