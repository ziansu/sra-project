@org.junit.Test
public void testIsInObject() throws java.lang.Exception {
    org.dedda.bratwurst.lang.Scope scope = new org.dedda.bratwurst.lang.Scope(null);
    assertFalse(scope.isInObject());
    scope = new org.dedda.bratwurst.lang.Scope(new org.dedda.bratwurst.lang.BWObject(null, new org.dedda.bratwurst.lang.BWVariable[0], new org.dedda.bratwurst.lang.BWFunction[0]));
    assertTrue(scope.isInObject());
}