public double calculateInsideWheelSpeed(double outsideWheelSpeed, double turnSteepness) {
    double turnRadius = turnSteepness * (Constants.maxTurnRadius);
    return outsideWheelSpeed * ((turnRadius + (Constants.robotWidth)) / turnRadius);
}