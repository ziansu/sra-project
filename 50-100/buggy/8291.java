@org.junit.Test
public void testFunction() throws java.lang.Exception {
    function.setArguments(arguments);
    function.run(new org.dedda.bratwurst.lang.Scope(null));
    assertEquals(expectedValue.getValueType(), function.getValueType());
    assertEquals(expectedValue.getIntValue(), function.getIntValue());
}