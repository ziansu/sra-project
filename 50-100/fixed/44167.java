@org.junit.Test
public void testIt() throws java.lang.Exception {
    final com.puppycrawl.tools.checkstyle.DefaultConfiguration checkConfig = createCheckConfig(com.puppycrawl.tools.checkstyle.checks.coding.EqualsHashCodeCheck.class);
    final java.lang.String[] expected = new java.lang.String[]{ "94:13: " + (getCheckMessage(com.puppycrawl.tools.checkstyle.checks.coding.EqualsHashCodeCheck.MSG_KEY_HASHCODE)) };
    verify(checkConfig, getPath("InputSemantic.java"), expected);
}