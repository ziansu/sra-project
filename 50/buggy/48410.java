@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsNOKBecauseArgumentDoesNotApplyToTheFormat() {
    boolean b = fact.validateFormat("aap", "paa");
    org.junit.Assert.assertFalse(b);
}