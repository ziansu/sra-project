@org.junit.Test
public void testUpdateTracker() {
    final int TIMES_WALKING = 5;
    final int TIMES_SITTING = 1;
    final int TIMES_STANDING = 4;
    simulateMovementTracking(TIMES_WALKING, TIMES_SITTING, TIMES_STANDING);
    int[][] movementTracker = mover.movementTracker;
    junit.framework.Assert.assertEquals(movementTracker[0][0], TIMES_WALKING);
    junit.framework.Assert.assertEquals(movementTracker[1][0], TIMES_STANDING);
    junit.framework.Assert.assertEquals(movementTracker[2][0], TIMES_SITTING);
}