@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterWithParametersNullValue() {
    org.eclipse.virgo.repository.internal.StandardQueryTests.QUERY.addFilter("monkey", null, new java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>>(0));
}