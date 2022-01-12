@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsNOKBecauseArgumentIsNull() {
    boolean b = fact.validateFormat(null, null);
    assertFalse(b);
}