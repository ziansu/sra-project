@org.junit.Test
public void stdWeatherDataLine() {
    org.agmip.core.types.WeatherDataLine test = new org.agmip.core.types.WeatherDataLine(new java.util.HashMap<java.lang.String, java.lang.Object>() {
        {
            put("tmax", 12.34);
        }
    });
    assertEquals("Max Temperature", new java.lang.Double(12.34), test.getTempMax());
    assertEquals("Min Temperature", new java.lang.Double((-99.99)), test.getTempMin());
}