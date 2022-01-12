public void enableVelocityOverrideWithVelocity(double velocity) {
    if ((velocityPID.getSetpoint()) < 0) {
        velocity = -velocity;
    }
    if ((override) == false) {
        override = true;
        overrideVelocity = velocity;
        originalVelocity = velocityPID.getSetpoint();
        velocityPID.setSetpoint(overrideVelocity);
    }else {
        overrideVelocity = velocity;
        velocityPID.setSetpoint(overrideVelocity);
    }
}