public void update(long timeElapsed, long nanosPerSecond, double xForces, double yForces) {
    double secondsElapsed = timeElapsed / nanosPerSecond;
    x += (velX) * secondsElapsed;
    y += (velY) * secondsElapsed;
    velX += (acelX) * secondsElapsed;
    velY += (acelY) * secondsElapsed;
    acelX = xForces / (mass);
    acelY = yForces / (mass);
}