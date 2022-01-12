public void drive(double forward, double rotation) {
    DRIVE.arcadeDrive(((throttle) * forward), ((-(throttle)) * rotation), false);
}