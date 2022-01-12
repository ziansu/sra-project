@org.testng.annotations.Test
public void testBuilder() {
    java.util.Map<java.lang.String, java.lang.String> paramsByKey = asParams(StringLengthConstraint.MIN_LENGTH, 3);
    java.util.Collection<com.pipeclamp.api.Constraint<?>> vc = StringLengthConstraint.Builder.constraintsFrom(Schema.Type.INT, false, paramsByKey);
    assertNotNull(vc);
    assertTrue(paramsByKey.isEmpty());
    paramsByKey = asParams(StringLengthConstraint.MAX_LENGTH, 3);
    vc = NumericConstraint.Builder.constraintsFrom(Schema.Type.INT, false, paramsByKey);
    assertNotNull(vc);
    assertEquals(0, paramsByKey.size());
}