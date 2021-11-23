public void setTurnTarget(double degrees) {
    pidTurning.setSetPoint(((pidTurning.getSourceVal()) + (degrees * (org.firstinspires.ftc.griffins.RobotHardware.ENCODER_COUNTS_PER_ROBOT_DEGREE))));
    pidTurningDifference.setSetPoint(pidTurningDifference.getSourceVal());
    isTurning = true;
}