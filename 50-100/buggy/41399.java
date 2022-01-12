@org.junit.Test
public void testLoadConfigurationDeprecated() {
    try {
        @java.lang.SuppressWarnings(value = "deprecation")
        final com.puppycrawl.tools.checkstyle.DefaultConfiguration config = ((com.puppycrawl.tools.checkstyle.DefaultConfiguration) (com.puppycrawl.tools.checkstyle.ConfigurationLoader.loadConfiguration(new java.io.FileInputStream(com.puppycrawl.tools.checkstyle.ConfigurationLoaderTest.getConfigPath("config_with_ignore.xml")), new com.puppycrawl.tools.checkstyle.PropertiesExpander(new java.util.Properties()), true)));
        final com.puppycrawl.tools.checkstyle.api.Configuration[] children = config.getChildren();
        org.junit.Assert.assertEquals(0, children[0].getChildren().length);
    } catch (com.puppycrawl.tools.checkstyle.api.CheckstyleException | java.io.FileNotFoundException ignored) {
        org.junit.Assert.fail("unexpected exception");
    }
}