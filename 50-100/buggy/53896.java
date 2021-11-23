double deadband(double rawValue, double deadspace) {
    if (rawValue > deadspace) {
        return (rawValue - deadspace) / deadspace;
    }
    if (rawValue < (-deadspace)) {
        return (rawValue + deadspace) / deadspace;
    }
    return 0;
}