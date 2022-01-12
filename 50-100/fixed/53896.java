double deadband(double rawValue, double deadspace) {
    if (rawValue > deadspace) {
        return (rawValue - deadspace) / (1 - deadspace);
    }
    if (rawValue < (-deadspace)) {
        return (rawValue + deadspace) / (1 - deadspace);
    }
    return 0;
}