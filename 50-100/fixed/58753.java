protected void driveForDistance(double power, int length) throws java.lang.InterruptedException {
    int powerSign = ((int) (java.lang.Math.signum(power)));
    length = java.lang.Math.abs(length);
    double initialDrivePosition = getEncoderPosition();
    double desiredPosition = initialDrivePosition + (powerSign * length);
    startDrivingAt(power);
    while ((desiredPosition * powerSign) >= ((getEncoderPosition()) * powerSign))
        applySensorAdjustmentsToMotors(true, true, false);
    
    stopDriving();
}