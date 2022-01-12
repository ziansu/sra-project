@org.junit.Test
@org.junit.experimental.categories.Category(value = org.mrgeo.junit.UnitTest.class)
public void testParseSettingMissingClosingQuotes() throws java.io.IOException {
    java.lang.String strSetting = "abc=\"bad value";
    java.util.Map<java.lang.String, java.lang.String> settings = new java.util.HashMap<java.lang.String, java.lang.String>();
    try {
        org.mrgeo.data.vector.geowave.GeoWaveVectorDataProvider.parseDataSourceSettings(strSetting, settings);
        org.junit.Assert.fail("Expected exception for missing double quote");
    } catch (java.io.IOException e) {
        org.junit.Assert.assertTrue(("Wrong exception message: " + (e.getMessage())), e.getMessage().equals(("Invalid GeoWave settings string, expected ending double quote for key abc in " + strSetting)));
    }
}