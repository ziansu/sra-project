@org.junit.Test
public void testGetCurrentUtcTimeAsIso8601() {
    java.text.SimpleDateFormat xmlDateUtc = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    xmlDateUtc.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    java.util.Calendar time = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
    java.lang.String expectedStr = xmlDateUtc.format(time.getTime());
    java.lang.String actualStr = util.DateHelpers.getUtcTimeAsIso8601(time);
    org.junit.Assert.assertEquals(expectedStr, actualStr);
}