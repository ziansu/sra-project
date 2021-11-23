@org.junit.Test
@org.junit.experimental.categories.Category(value = org.mrgeo.junit.UnitTest.class)
public void testParseMissingValue() {
    java.lang.String keyName = "abc";
    org.mrgeo.data.vector.geowave.Map<java.lang.String, java.lang.String> settings = new org.mrgeo.data.vector.geowave.HashMap<java.lang.String, java.lang.String>();
    try {
        org.mrgeo.data.vector.geowave.GeoWaveVectorDataProvider.parseDataSourceSettings((keyName + "="), settings);
        org.junit.Assert.fail("Expected an exception");
    } catch (java.io.IOException e) {
        org.junit.Assert.assertTrue("Wrong message", e.getMessage().equals(("Missing value for " + keyName)));
    }
}