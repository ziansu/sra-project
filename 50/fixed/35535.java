@org.junit.Test
public void testDateToHHmm() throws java.lang.Exception {
    org.junit.Assert.assertNull(zonedDateTimeToHHMM(null));
    java.time.ZonedDateTime dateTime = fullFormatToZonedDateTime("2015-08-14T20:01:00Z");
    org.junit.Assert.assertEquals("20:01", zonedDateTimeToHHMM(dateTime));
}