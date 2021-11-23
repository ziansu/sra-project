@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterNullValue() {
    query.addFilter("monkey", null);
}