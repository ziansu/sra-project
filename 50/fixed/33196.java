@java.lang.Override
public void tearDown() throws java.lang.Exception {
    com.google.common.util.concurrent.TestPlatform.clearInterrupt();
    com.google.common.util.concurrent.FuturesTest.aggregateFutureLogger.removeHandler(aggregateFutureLogHandler);
    super.tearDown();
}