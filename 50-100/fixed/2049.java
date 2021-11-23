@org.testng.annotations.Test
public void testGetsWithDefault() throws java.lang.Exception {
    com.paypal.selion.utils.ConfigParser config = com.paypal.selion.utils.ConfigParser.parse();
    long maxFileSize = config.getLong("along", 10L);
    java.lang.String managedArtifact = config.getString("astring", "default");
    int sessionCount = config.getInt("anint", 10);
    org.testng.Assert.assertEquals(maxFileSize, 10L);
    org.testng.Assert.assertEquals(managedArtifact, "default");
    org.testng.Assert.assertEquals(sessionCount, 10);
}