public void driveRobot() {
    theDriveDirection = theLeftStick.getDirectionDegrees();
    theDriveMagnitude = theLeftStick.getMagnitude();
    theDriveRotation = theRightStick.getDirectionDegrees();
    theRobotDrive.mecanumDrive_Polar(theDriveMagnitude, theDriveDirection, theDriveRotation);
}