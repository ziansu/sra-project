public static void pollingVerify(java.lang.Runnable verify) {
    java.lang.AssertionError lastVerification;
    com.google.common.base.Stopwatch watch = com.google.common.base.Stopwatch.createStarted();
    do {
        try {
            lastVerification = null;
            verify.run();
        } catch (java.lang.AssertionError e) {
            lastVerification = e;
            try {
                java.lang.Thread.sleep(com.onyxscheduler.util.PollingVerifier.VERIFYING_POLL_PERIOD_IN_MILLIS);
            } catch (java.lang.InterruptedException e1) {
                com.google.common.base.Throwables.propagate(e1);
            }
        }
    } while ((watch.elapsed(java.util.concurrent.TimeUnit.MILLISECONDS)) < (com.onyxscheduler.util.PollingVerifier.VERIFYING_POLL_TIMEOUT_IN_MILLIS) );
    if (lastVerification != null) {
        throw lastVerification;
    }
}