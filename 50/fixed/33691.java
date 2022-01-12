@org.junit.Test
public void testDate2Instant() throws java.lang.Exception {
    java.util.Date date = com.peter.util.time.Time.string2IsoDate("2025-11-11T13:22:17.796Z");
    org.joda.time.Instant instant = com.peter.util.time.Time.date2Instant(date);
    org.junit.Assert.assertTrue(instant.toString().equals("2025-11-11T13:22:17.796Z"));
}