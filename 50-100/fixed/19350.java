private double travelledVerticalDistance(double dt, int stateSign) {
    return (((this.getVerticalVelocity()) * dt) * stateSign) + (((this.getVerticalAcceleration()) * (java.lang.Math.pow(dt, 2))) / 2);
}