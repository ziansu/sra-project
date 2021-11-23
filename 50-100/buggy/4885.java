@java.lang.Override
public void onChange() {
    try {
        assertEquals(1, numberOfInvocation.incrementAndGet());
        assertTrue(realmResults.isLoaded());
        assertEquals(5, realmResults.getColumnLong());
        assertEquals("The Endless River", realmResults.getColumnString());
    } catch (junit.framework.AssertionFailedError e) {
        threadAssertionError[0] = e;
    } finally {
        signalCallbackFinished.countDown();
    }
}