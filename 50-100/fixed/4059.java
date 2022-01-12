public void extendEqual(java.lang.String direction, double speed) {
    if (direction == "out") {
        armExtender.setTargetPosition(((armExtender.getCurrentPosition()) + 50));
    }
    if (direction == "in") {
        armExtender.setTargetPosition(((armExtender.getCurrentPosition()) - 50));
    }
    if (direction == "STOP") {
        armExtender.setPower(0.0);
    }
    armExtender.setPower(gamepad2.left_stick_y);
}