@org.junit.Test
public void testLoadConfigurationFromClassPath() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration config = ((com.puppycrawl.tools.checkstyle.DefaultConfiguration) (com.puppycrawl.tools.checkstyle.ConfigurationLoader.loadConfiguration(("/com/puppycrawl/tools/checkstyle/configs/" + "config_with_ignore.xml"), new com.puppycrawl.tools.checkstyle.PropertiesExpander(new java.util.Properties()), true)));
    final com.puppycrawl.tools.checkstyle.api.Configuration[] children = config.getChildren();
    org.junit.Assert.assertEquals(0, children[0].getChildren().length);
}