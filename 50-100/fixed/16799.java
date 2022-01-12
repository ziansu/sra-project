@org.junit.Test
public void testExecutionTimeForRanges() {
    final com.cronutils.parser.CronParser quartzParser = new com.cronutils.parser.CronParser(com.cronutils.model.definition.CronDefinitionBuilder.instanceDefinitionFor(CronType.QUARTZ));
    com.cronutils.model.time.ExecutionTime executionTime = com.cronutils.model.time.ExecutionTime.forCron(quartzParser.parse("* 10-20 * * * * 2099"));
    org.joda.time.DateTime scanTime = org.joda.time.DateTime.parse("2016-02-29T11:00:00.000-06:00");
    org.joda.time.DateTime nextTime = executionTime.nextExecution(scanTime);
    assertNotNull(nextTime);
    assertEquals(10, nextTime.getMinuteOfHour());
}