public double getGyro() {
    double finalAngle = 90 + ((gyro.getAngle()) - 360);
    for (int i = 0; finalAngle > 360; i++) {
        finalAngle -= 360;
    }
    return finalAngle;
}