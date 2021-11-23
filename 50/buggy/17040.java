private long calculateDelay(float minimumAcquisitionTime, float minimumServoMovementTime) {
    float delayPerStep = (minimumAcquisitionTime * 1000) / (calculateNumberOfScans());
    float actualDelay = java.lang.Math.max(delayPerStep, minimumAcquisitionTime);
    return java.lang.Math.round((actualDelay * 1000.0));
}