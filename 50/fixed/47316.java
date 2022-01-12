@org.junit.Test(expected = no.api.meteo.MeteoException.class)
public void testBadDateString() throws java.lang.Exception {
    fullFormatToZonedDateTime("ddd");
}