public static void assertEvalString(java.lang.String script, java.lang.String expected) {
    org.junit.Assert.assertEquals(expected, org.libj.xquery.Compiler.eval(script).toString());
}