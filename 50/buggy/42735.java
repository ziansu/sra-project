@org.junit.Test
public void testNpe() throws java.lang.Exception {
    final java.lang.String[] expected = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
    verify(checkConfig, getPath("whitespace/InputNoWhiteSpaceAfterCheckFormerNpe.java"), expected);
}