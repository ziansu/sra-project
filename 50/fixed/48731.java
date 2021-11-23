@java.lang.SuppressWarnings(value = "deprecation")
@junit.framework.Test
public void testGenerateGibberish() {
    assertTrue(true);
    java.lang.String gibberish = gg.generateGibberish(20);
    junit.framework.Assert.assertEquals(com.sj1.pr3.model.GenerateGibberishTest.EXPECTED_STRING_LENGTH, gibberish.length());
}