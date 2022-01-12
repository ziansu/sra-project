public static void createYAMLishActualAndExpected(java.util.Map<java.lang.String, java.lang.Object> yamlish, org.testng.ITestResult testNgTestResult) {
    java.lang.String expected = org.tap4j.ext.testng.util.TapTestNGYamlUtil.getExpected(testNgTestResult);
    java.lang.String actual = org.tap4j.ext.testng.util.TapTestNGYamlUtil.getActual(testNgTestResult);
    if (expected == null) {
        expected = "~";
    }
    if (actual == null) {
        actual = "~";
    }
    yamlish.put("got", actual);
    yamlish.put("expected", expected);
}