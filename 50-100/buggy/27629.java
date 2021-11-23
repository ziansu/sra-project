public void testLastExecutionEveryTwoWeeksStartingWithFirstDayOfYear() throws java.lang.Exception {
    com.cronutils.model.time.ZonedDateTime now = com.cronutils.model.time.ExecutionTimeQuartzWithDayOfYearExtensionIntegrationTest.truncateToDays(com.cronutils.model.time.ZonedDateTime.now());
    int dayOfYear = now.getDayOfYear();
    int dayOfMostRecentPeriod = dayOfYear % 14;
    com.cronutils.model.time.ZonedDateTime expected = (dayOfMostRecentPeriod == 1) ? now : now.minusDays((dayOfMostRecentPeriod - 1));
    com.cronutils.model.time.ExecutionTime executionTime = com.cronutils.model.time.ExecutionTime.forCron(parser.parse(com.cronutils.model.time.ExecutionTimeQuartzWithDayOfYearExtensionIntegrationTest.BI_WEEKLY_STARTING_WITH_FIRST_DAY_OF_YEAR));
    assertEquals(expected, executionTime.lastExecution(now).get());
}