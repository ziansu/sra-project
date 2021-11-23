@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterNullName() {
    org.eclipse.virgo.repository.internal.StandardQueryTests.QUERY.addFilter(null, "bananas");
}