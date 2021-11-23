public void waitUntilRunning(final long timeout) throws org.jboss.hal.testsuite.cli.TimeoutException {
    long decTimeout = timeout;
    final int step = 500;
    while (!(isInRunningState())) {
        if (decTimeout <= 0) {
            throw new org.jboss.hal.testsuite.cli.TimeoutException("Waiting for running server timed out!");
        }
        decTimeout -= step;
        org.jboss.hal.testsuite.cli.Library.letsSleep(step);
    } 
}