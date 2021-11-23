public void testMillisecondsFromNowUsingLong() throws java.lang.Exception {
    final long millisecondsInThePast = 50L;
    final long previousTimestamp = org.joda.time.DateTime.now().minus(millisecondsInThePast).getMillis();
    final long millisecondsFromTimestamp = com.bearded.common.time.TimeUtils.millisecondsFromNow(previousTimestamp);
    assertTrue((millisecondsFromTimestamp >= millisecondsInThePast));
    assertTrue((millisecondsFromTimestamp < 1000));
}