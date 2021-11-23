@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterWithParametersNullName() {
    query.addFilter(null, "bananas", new java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>>(0));
}