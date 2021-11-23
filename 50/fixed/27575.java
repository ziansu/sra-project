@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterNullName() {
    query.addFilter(null, "bananas");
}