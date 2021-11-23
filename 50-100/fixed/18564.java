@org.junit.Test
@org.junit.experimental.categories.Category(value = org.mrgeo.junit.UnitTest.class)
public void testParseNoAssignment() {
    java.lang.String strSettings = "abc";
    java.util.Map<java.lang.String, java.lang.String> settings = new java.util.HashMap<java.lang.String, java.lang.String>();
    try {
        org.mrgeo.data.vector.geowave.GeoWaveVectorDataProvider.parseDataSourceSettings(strSettings, settings);
        org.junit.Assert.fail("Expected an exception");
    } catch (java.io.IOException e) {
        org.junit.Assert.assertTrue("Wrong message", e.getMessage().equals((("Invalid syntax. No value assignment in \"" + strSettings) + "\"")));
    }
}