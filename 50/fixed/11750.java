public void verifyStopped(double minimumPower) {
    org.junit.Assert.assertEquals(0, getLeftSetpoint(), minimumPower);
    org.junit.Assert.assertEquals(0, getRightSetpoint(), minimumPower);
}