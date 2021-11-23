private void performAsyncSendStringTest(joynr.tests.performance.EchoProxy proxy) {
    runSyncStringTest(proxy, 1);
    runAsyncSendStringTest(proxy, io.joynr.performance.ConsumerApplication.invocationParameters.getNumberOfWarmupRuns());
    long startTime = java.lang.System.currentTimeMillis();
    int numFailures = runAsyncSendStringTest(proxy, io.joynr.performance.ConsumerApplication.invocationParameters.getNumberOfRuns());
    long endTime = java.lang.System.currentTimeMillis();
    printTestResult((endTime - startTime));
    printFailureStatistic(numFailures, io.joynr.performance.ConsumerApplication.invocationParameters.getNumberOfRuns());
}