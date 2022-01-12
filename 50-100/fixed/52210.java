private void echoTestSuiteDuration(boolean isParallel) {
    long testDuration = testSuite.getDurationSeconds();
    if (testDuration > 0) {
        com.hazelcast.simulator.coordinator.tasks.RunTestSuiteTask.LOGGER.info(java.lang.String.format("Running time per test: %s", com.hazelcast.simulator.utils.FormatUtils.secondsToHuman(testDuration)));
        long totalDuration = (isParallel) ? testDuration : testDuration * (testSuite.size());
        com.hazelcast.simulator.coordinator.tasks.RunTestSuiteTask.LOGGER.info(java.lang.String.format("Testsuite will run until tests are finished for a maximum time of: %s", com.hazelcast.simulator.utils.FormatUtils.secondsToHuman(totalDuration)));
    }else {
        com.hazelcast.simulator.coordinator.tasks.RunTestSuiteTask.LOGGER.info("Testsuite will run until tests are finished");
    }
}