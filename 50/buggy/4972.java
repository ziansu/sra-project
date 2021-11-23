public void setSpeeds(double speed, double angle) {
    Robot.driveTrain.setPower((speed + (angle / 2)), ((-1) * (speed - (angle / 2))));
}