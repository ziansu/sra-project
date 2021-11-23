@org.junit.Test
@junitparams.Parameters
public void testReplaceFileNamePatterns(java.lang.String template, java.lang.String expected) throws java.lang.Exception {
    java.lang.String result = de.austinpadernale.core.utils.ReplacementPatternProcessorTest.replacementPatternProcessor.replaceFileNameAndDateTimePatterns(de.austinpadernale.core.utils.ReplacementPatternProcessorTest.FILENAME, template);
    org.junit.Assert.assertEquals(expected, result);
}