@org.junit.Test
public void loadedHistoryDirectory() throws com.ubm.jwraith.config.ConfigurationFileException, java.io.FileNotFoundException {
    java.lang.String configurationFile = getClass().getClassLoader().getResource("configuration.yml").getPath();
    com.ubm.jwraith.config.ConfigurationTest.configuration.read(configurationFile);
    assertEquals("custom_history_shots", com.ubm.jwraith.config.ConfigurationTest.configuration.getHistoryDirectory());
}