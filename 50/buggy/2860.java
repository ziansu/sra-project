public void verifyNotTurning(double minimumDifference) {
    org.junit.Assert.assertTrue((((getLeftSetpoint()) - (getRightSetpoint())) < minimumDifference));
}