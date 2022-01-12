public void updateMotorPowerWithPID() {
    long currentTime = java.lang.System.currentTimeMillis();
    int currentEncoderPosition = encoderMotor.getCurrentPosition();
    int expectedTicksSinceUpdate = ((int) ((1120.0 * (desiredRPS)) * (1000.0 / (currentTime - (lastPIDUpdateTime)))));
    int actualTicksSinceUpdate = currentEncoderPosition - (previousMotorPosition);
    rpsConversionFactor += (expectedTicksSinceUpdate - actualTicksSinceUpdate) * 1.0E-4;
    updateMotorPowers();
    lastPIDUpdateTime = currentTime;
    previousMotorPosition = currentEncoderPosition;
}