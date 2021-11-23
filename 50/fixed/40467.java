protected void execute() {
    double speed = Robot.oi.operatorGamepad.getLeftY();
    Robot.hopper.go(speed);
}