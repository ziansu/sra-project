@org.junit.Test
public void testDefaultConfiguration() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.imports.CustomImportOrderCheck.class);
    java.lang.String[] expected = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
    try {
        createChecker(checkConfig);
        verify(checkConfig, getPath((("imports" + (java.io.File.separator)) + "InputCustomImportOrder.java")), expected);
    } catch (java.lang.Exception ex) {
        org.junit.Assert.fail();
    }
}