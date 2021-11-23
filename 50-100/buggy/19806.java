private boolean isSignificantMovementDetected() {
    for (int i = 0; i < 3; i++) {
        if ((java.lang.Math.abs(cachedAccelerationData[i])) > ((maximumDeltaAcceleration) * 2)) {
            return true;
        }
    }
    return false;
}