@org.junit.Test
public void testGetDivisors() {
    org.junit.Assert.assertEquals("[1]", getDivisorsOrdered(1).toString());
    org.junit.Assert.assertEquals("[1, 2]", getDivisorsOrdered(2).toString());
    org.junit.Assert.assertEquals("[1, 2, 3, 6, 7, 14, 21, 42]", getDivisorsOrdered(42).toString());
}