@java.lang.Override
public void execute() {
    double translationPower = leftJoystick.getVector().getMagnitude();
    setTargetHeading();
    double headingError = poseSubsystem.getCurrentHeading().difference(targetHeadingSupplier.getAsDouble());
    double rotationPower = -(headingDrivePid.calculate(0, headingError));
    driveSubsystem.tankDrivePowerMode((translationPower - rotationPower), (translationPower + rotationPower));
}