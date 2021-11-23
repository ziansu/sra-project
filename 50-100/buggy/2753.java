@org.junit.Test(expected = java.util.NoSuchElementException.class)
public void testToManyCalls() {
    java.lang.Integer[] integers = new java.lang.Integer[]{ 1 , 2 , 3 };
    org.zetool.container.util.ArrayIterator<java.lang.Integer> ii = new org.zetool.container.util.ArrayIterator(integers);
    while (ii.hasNext()) {
    } 
    ii.next();
}