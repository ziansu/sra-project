@org.junit.Test
public void testPatternToLower() throws java.lang.Exception {
    junit.framework.Assert.assertEquals(new com.pwn9.PwnFilter.minecraft.util.ColoredString("this&0 is the string &8to test"), testCs.patternToLower(java.util.regex.Pattern.compile("This")));
}