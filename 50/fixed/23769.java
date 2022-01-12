@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterWithParametersNullParameters() {
    query.addFilter("monkey", "bananas", null);
}