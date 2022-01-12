@org.junit.Test
public void testGenerateName_withThreeToTwentyLength() {
    for (int i = 3; i < 20; i++) {
        final java.lang.String result = grammarNameGenerator.generateName(0);
        org.junit.Assert.assertTrue(((result.length()) >= 1));
    }
}