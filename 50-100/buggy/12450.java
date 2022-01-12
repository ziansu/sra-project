public void verifyDriveArcingRight(double minimumDifference) {
    org.junit.Assert.assertTrue((((getLeftSetpoint()) - (getRightSetpoint())) > minimumDifference));
    org.junit.Assert.assertTrue(((((xbot.common.controls.actuators.MockCANTalon) (drive.rightDrive)).getSetpoint()) > 0));
}