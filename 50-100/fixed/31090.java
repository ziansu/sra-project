public void testInterruptsThread() throws java.lang.InterruptedException {
    org.perf4j.helpers.GenericAsyncCoalescingStatisticsAppender appender = new org.perf4j.helpers.GenericAsyncCoalescingStatisticsAppender();
    org.perf4j.helpers.GenericAsyncCoalescingStatisticsAppenderTest.TestGroupedTimingStatisticsHandler handler = new org.perf4j.helpers.GenericAsyncCoalescingStatisticsAppenderTest.TestGroupedTimingStatisticsHandler();
    appender.setTimeSlice(1L);
    appender.setShutdownWaitMillis(1L);
    appender.start(handler);
    appender.append("start[1230068856846] time[2] tag[tag1]");
    java.lang.Thread.sleep(100L);
    appender.stop();
    java.lang.Thread.sleep(100L);
    assertTrue("Handler was not interrupted", handler.wasInterrupted);
}