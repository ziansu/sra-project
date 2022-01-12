public void turnArmLeft(int angle) {
    int turn = java.lang.Math.min(RobotMovement.SensorArm.MAXLEFT, ((motor.getTachoCount()) + angle));
    motor.rotateTo(turn);
}