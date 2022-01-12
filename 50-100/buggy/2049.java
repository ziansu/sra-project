@org.testng.annotations.Test
public void testGetsWithDefault() throws java.lang.Exception {
    com.paypal.selion.utils.ConfigParser config = com.paypal.selion.utils.ConfigParser.parse();
    long maxFileSize = config.getLong("along", 10L);
    java.lang.String managedArtifact = config.getString("astring", "default");
    int sessionCount = config.getInt("anint", 10);
    assertEquals(maxFileSize, 10L);
    assertEquals(managedArtifact, "default");
    assertEquals(sessionCount, 10);
}