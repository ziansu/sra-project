public static void testVelocityFrequencyRadiusRelation(double frequency, control.Trajectory1d target) {
    for (double i = 0; i < 30; i += 1 / frequency) {
        org.junit.Assert.assertEquals(0, applications.trajectory.TestUtils.getVelocity(target, i), 0.01);
    }
}