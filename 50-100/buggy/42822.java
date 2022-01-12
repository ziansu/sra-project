@org.testng.annotations.Test
public void testDefaults() {
    com.github.jlgrock.snp.core.defaultconfig.MongoConfig mongoConfig = new com.github.jlgrock.snp.core.defaultconfig.MongoConfig();
    org.testng.Assert.assertEquals(mongoConfig.getHost().get().getHost(), MongoConfig.DEFAULT_HOST);
    org.testng.Assert.assertEquals(mongoConfig.getHost().get().getPort(), MongoConfig.DEFAULT_PORT.intValue());
    org.testng.Assert.assertEquals(mongoConfig.getDefaultDatabase(), MongoConfig.DEFAULT_DATABASE);
}