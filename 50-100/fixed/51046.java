public void updateMotorPowerWithPID() {
    long currentTime = java.lang.System.currentTimeMillis();
    int currentEncoderPosition = encoderMotor.getCurrentPosition();
    int expectedTicksSinceUpdate = ((int) ((1120.0 * (desiredRPS)) * ((currentTime - (lastPIDUpdateTime)) / 1000.0)));
    int actualTicksSinceUpdate = currentEncoderPosition - (previousMotorPosition);
    rpsConversionFactor += (expectedTicksSinceUpdate - actualTicksSinceUpdate) * 1.0E-4;
    updateMotorPowers();
    lastPIDUpdateTime = currentTime;
    previousMotorPosition = currentEncoderPosition;
}