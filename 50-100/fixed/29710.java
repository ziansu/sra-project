@org.junit.Test
public void testTimeShiftingProperlyDone() throws java.lang.Exception {
    com.cronutils.model.time.ExecutionTime executionTime = com.cronutils.model.time.ExecutionTime.forCron(quartzCronParser.parse("0 0/10 22 * * *"));
    org.joda.time.DateTime nextExecution = executionTime.nextExecution(org.joda.time.DateTime.now().withHourOfDay(15).withMinuteOfHour(27));
    java.lang.System.out.println(nextExecution);
    org.junit.Assert.assertEquals(22, nextExecution.getHourOfDay());
    org.junit.Assert.assertEquals(0, nextExecution.getMinuteOfHour());
}