@org.junit.Test
public void testGetVersion() throws java.lang.Exception {
    org.apache.tamaya.Configuration config = org.apache.tamaya.ConfigurationProvider.getConfiguration();
    org.apache.tamaya.events.ConfigurationChange change = org.apache.tamaya.events.ConfigurationChangeBuilder.of(config).build();
    assertNotNull(change.getVersion());
    change = org.apache.tamaya.events.ConfigurationChangeBuilder.of(config).setVersion("version2").build();
    assertEquals("version2", change.getVersion());
}