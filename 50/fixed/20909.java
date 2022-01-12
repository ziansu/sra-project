public void updateFromGyroscope(float gyroX, float gyroY) {
    gyroXOffset = actualRect.forceInLeftRight(((gyroXOffset) + gyroX));
    gyroYOffset = actualRect.forceInTopBottom(((gyroYOffset) + gyroY));
    notifyNewGyroValues();
}