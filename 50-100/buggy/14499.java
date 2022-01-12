@org.junit.Test
public void testBuilder() {
    com.parse.Parse.Configuration.Builder builder = new com.parse.Parse.Configuration.Builder(null);
    builder.applicationId("foo");
    builder.clientKey("bar");
    builder.server("some.server");
    builder.enableLocalDataStore();
    com.parse.Parse.Configuration configuration = builder.build();
    org.junit.Assert.assertNull(configuration.context);
    org.junit.Assert.assertEquals(configuration.applicationId, "foo");
    org.junit.Assert.assertEquals(configuration.clientKey, "bar");
    org.junit.Assert.assertEquals(configuration.server, "some.server");
    org.junit.Assert.assertEquals(configuration.localDataStoreEnabled, true);
}