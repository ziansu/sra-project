public synchronized boolean isAtSpeed() {
    if ((java.lang.Math.abs(((_currentSpeed) - (_targetSpeed)))) > 0.01) {
        return false;
    }
    return true;
}