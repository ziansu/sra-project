@java.lang.Override
public void onChange() {
    try {
        assertEquals(1, numberOfInvocation.incrementAndGet());
        assertTrue(realmResults.isLoaded());
        assertEquals(0, realmResults.size());
    } catch (junit.framework.AssertionFailedError e) {
        threadAssertionError[0] = e;
    } finally {
        signalCallbackFinished.countDown();
    }
}