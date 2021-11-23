public static void awaitThreadState(final java.lang.Thread thread, final java.lang.Thread.State state, final int timeoutInMs) throws java.lang.InterruptedException {
    final long interPauseTimeInMs = 10;
    int waitingTimeInMs = 0;
    while ((thread.getState()) != state) {
        if (waitingTimeInMs > timeoutInMs) {
            throw new java.lang.AssertionError(((((("The given thread does not change its state to " + state) + " within ") + timeoutInMs) + " ms. Current state: ") + (thread.getState())));
        }
        java.lang.Thread.sleep(interPauseTimeInMs);
        waitingTimeInMs += interPauseTimeInMs;
    } 
}