@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsNOKBecauseArgumentDoesNotApplyToTheFormat() {
    boolean b = fact.validateFormat("aap", "paa");
    assertFalse(b);
}