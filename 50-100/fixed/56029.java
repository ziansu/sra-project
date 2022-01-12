@org.junit.Test
public void testUnexpectedChar() throws java.lang.Exception {
    org.junit.Assume.assumeFalse(com.puppycrawl.tools.checkstyle.grammars.GeneratedJava14LexerTest.IS_WINDOWS);
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck.class);
    final java.lang.String[] expected = new java.lang.String[]{ "7:9: " + (getCheckMessage(com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck.class, com.puppycrawl.tools.checkstyle.checks.naming.AbstractNameCheck.MSG_INVALID_PATTERN, new java.lang.String(new char[]{ 195 , 1071 }), "^[a-z][a-zA-Z0-9]*$")) };
    verify(checkConfig, getPath("InputGrammar.java"), expected);
}