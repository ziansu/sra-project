@org.junit.Test
public void addItemToExtraData() {
    org.agmip.core.types.WeatherDataLine test = new org.agmip.core.types.WeatherDataLine(new java.util.HashMap<java.lang.String, java.lang.Object>());
    test.setExtraData("extra_one", 12.34);
    test.setExtraData("extra_two", "HELLO");
    java.util.HashMap extra = test.getExtraData();
    assertEquals("Min Temperature", null, test.getTempMin());
    assertEquals("Extra One", 12.34, extra.get("extra_one"));
    assertEquals("Extra Two", "HELLO", extra.get("extra_two"));
}