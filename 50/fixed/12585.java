@org.junit.Test
public final void testIsRunning() {
    cTimer.reset();
    org.junit.Assert.assertTrue(cTimer.isRunning());
    cTimer.stop();
    org.junit.Assert.assertFalse(cTimer.isRunning());
}