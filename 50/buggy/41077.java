public void waitForLayout(long timeout) throws java.lang.Throwable {
    waitForLayout((timeout * (mDebug ? 10000 : 1)), java.util.concurrent.TimeUnit.SECONDS);
}