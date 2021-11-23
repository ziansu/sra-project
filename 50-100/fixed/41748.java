private void testReplaceMacro(java.lang.String expected, java.lang.String original, java.util.Map<java.lang.String, java.lang.String> variables) throws java.lang.Exception {
    java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(original.getBytes(Constants.DEFAULT_CHARSET));
    java.io.InputStream result = com.microsoft.jenkins.kubernetes.util.CommonUtils.replaceMacro(in, (variables == null ? null : new hudson.util.VariableResolver.ByMap<>(variables)));
    org.junit.Assert.assertEquals(expected, org.apache.commons.io.IOUtils.toString(result, Constants.DEFAULT_CHARSET));
}