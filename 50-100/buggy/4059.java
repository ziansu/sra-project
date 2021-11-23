public void extendEqual(java.lang.String direction, double speed) {
    double ratio = 1;
    double driveSpeed = speed;
    double slowSpeed = 0.0;
    int lbm = 200;
    if (direction == "out") {
        armExtender.setTargetPosition(((armExtender.getCurrentPosition()) + 50));
    }
    if (direction == "in") {
        armExtender.setTargetPosition(((armExtender.getCurrentPosition()) - 50));
    }
    if (direction == "STOP")
        armExtender.setPower(gamepad2.left_stick_y);
    
}