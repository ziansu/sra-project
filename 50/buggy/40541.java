public double getYDriveAxis() {
    return reverseDrive ? -1 : (1 * ((getHID(gamepad1).axis(driveLeftAxis)) + (getHID(gamepad1).axis(driveRightAxis)))) / 2;
}