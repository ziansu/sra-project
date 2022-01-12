public double calculateInsideWheelSpeed(double outsideWheelSpeed, double turnSteepness) {
    double turnRadius = (Constants.maxTurnRadius) - (turnSteepness * (Constants.maxTurnRadius));
    return outsideWheelSpeed * (turnRadius / (turnRadius + (Constants.robotWidth)));
}