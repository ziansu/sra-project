protected void initialize() {
    double speed = Robot.oi.operatorGamepad.getLeftY();
    Robot.hopper.go(speed);
}