public java.util.List<java.lang.String> retrieveRegressionTestCases() {
    java.lang.String casesTest = ConfigurationProperties.properties.getProperty("testcasesregression");
    java.lang.String[] cases = casesTest.split(";");
    return java.util.Arrays.asList(cases);
}