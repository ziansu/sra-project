public double getMagnitude(double deltaTime) {
    double magnitude = force.getMagnitude(deltaTime);
    double newVelocity = (force.getVelocity()) - (magnitude * deltaTime);
    if (newVelocity <= (java.lang.Double.MIN_NORMAL)) {
        magnitude = magnitude - newVelocity;
        isExhausted = true;
        force.setVelocity(java.lang.Double.MIN_NORMAL);
    }
    force.setVelocity(newVelocity);
    return magnitude;
}