@java.lang.Override
public void execute() {
    double errorInDegrees = drive.imu.getYaw().difference(targetHeading);
    double normalizedError = errorInDegrees / 180;
    double rotationalPower = headingDrivePid.calculate(0, normalizedError);
    rotationalPower *= -1;
    drive.tankDrivePowerMode(rotationalPower, (-rotationalPower));
}