@org.junit.Test
public void testValidateFormatWhenPassingAStringAndResultIsOK() {
    boolean b = fact.validateFormat("aaa", "aaa");
    assertTrue(b);
}