public void updateFromGyroscope(float gyroX, float gyroY) {
    gyroXOffset += gyroX;
    gyroYOffset += gyroY;
    gyroXOffset = actualRect.forceInLeftRight(gyroXOffset);
    gyroYOffset = actualRect.forceInTopBottom(gyroYOffset);
    notifyNewGyroValues();
}