@org.junit.Test
public void loadedWorkers() throws com.ubm.jwraith.config.ConfigurationFileException, java.io.FileNotFoundException {
    java.lang.String configurationFile = getClass().getClassLoader().getResource("configuration.yml").getPath();
    com.ubm.jwraith.config.ConfigurationTest.configuration.read(configurationFile);
    assertEquals(4, com.ubm.jwraith.config.ConfigurationTest.configuration.getWorkers());
}