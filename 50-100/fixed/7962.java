@org.junit.Test
public void testGenerateName_withThreeToTwentyLength() {
    for (int i = 3; i < 20; i++) {
        final java.lang.String result = grammarNameGenerator.generateName(i);
        org.junit.Assert.assertTrue(((result.length()) <= i));
        org.junit.Assert.assertTrue(((result.length()) > 0));
    }
}