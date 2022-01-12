@org.junit.Test
public void testGetTimestamp() throws java.lang.Exception {
    org.apache.tamaya.Configuration config = org.apache.tamaya.ConfigurationProvider.getConfiguration();
    org.apache.tamaya.events.ConfigurationChange change = org.apache.tamaya.events.ConfigurationChangeBuilder.of(config).build();
    assertTrue((((java.lang.System.currentTimeMillis()) - (change.getTimestamp())) > 0L));
    change = org.apache.tamaya.events.ConfigurationChangeBuilder.of(config).setTimestamp(10L).build();
    assertEquals(10L, change.getTimestamp());
}