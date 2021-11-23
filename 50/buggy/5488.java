public void drive(double xAxis, double yAxis, double mid) {
    hDrive.arcadeDrive(xAxis, yAxis);
    middleMotor1.set(mid);
}