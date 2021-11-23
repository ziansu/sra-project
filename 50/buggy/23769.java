@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterWithParametersNullParameters() {
    org.eclipse.virgo.repository.internal.StandardQueryTests.QUERY.addFilter("monkey", "bananas", null);
}