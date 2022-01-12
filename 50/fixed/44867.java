public void setTurnTarget(double degrees) {
    pidTurning.setSetPoint(((pidTurning.getSourceVal()) + degrees));
    pidTurningDifference.setSetPoint(pidTurningDifference.getSourceVal());
    isTurning = true;
}