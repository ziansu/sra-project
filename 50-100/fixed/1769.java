@org.junit.BeforeClass
public static void setConfigurationBuilder() throws com.puppycrawl.tools.checkstyle.api.CheckstyleException {
    final java.util.List<com.puppycrawl.tools.checkstyle.api.Configuration> configs = getCheckConfigs("ParameterName");
    org.junit.Assert.assertEquals(1, configs.size());
    com.google.checkstyle.test.chapter5naming.rule526parameternames.ParameterNameTest.config = configs.get(0);
    com.google.checkstyle.test.chapter5naming.rule526parameternames.ParameterNameTest.format = com.google.checkstyle.test.chapter5naming.rule526parameternames.ParameterNameTest.config.getAttribute("format");
}