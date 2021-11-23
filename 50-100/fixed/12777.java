@org.junit.Test
public void testTrajectoryBoundsZVelocity() {
    java.util.List<java.lang.Double> l = com.google.common.collect.Lists.newArrayList();
    for (int i = 0; i < ((trajectory.getTrajectoryDuration()) * 10); i++) {
        l.add(getVelocityZ(trajectory, (i / 10.0)));
    }
    assertBounds(l, speed, speed);
}