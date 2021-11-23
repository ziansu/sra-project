@org.junit.Test(expected = no.api.meteo.MeteoException.class)
public void testBadDateString() throws java.lang.Exception {
    no.api.meteo.util.MeteoDateUtils.fullFormatToZonedDateTime("ddd");
}