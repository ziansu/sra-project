@org.junit.Test
public void testDateToHHmm() throws java.lang.Exception {
    org.junit.Assert.assertNull(no.api.meteo.util.MeteoDateUtils.zonedDateTimeToHHMM(null));
    java.time.ZonedDateTime dateTime = no.api.meteo.util.MeteoDateUtils.fullFormatToZonedDateTime("2015-08-14T20:01:00Z");
    org.junit.Assert.assertEquals("20:01", no.api.meteo.util.MeteoDateUtils.zonedDateTimeToHHMM(dateTime));
}