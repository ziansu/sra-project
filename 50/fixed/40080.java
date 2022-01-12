public double estimatedDuration() {
    double speed = velocity.getFinalVelocity();
    if (speed < 1) {
        speed = 1.4;
    }
    double eDuration;
    eDuration = (distance) / (speed + (userVelocity));
    return eDuration;
}