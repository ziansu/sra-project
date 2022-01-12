@org.junit.Test
public void testGetDivisors() {
    org.junit.Assert.assertEquals("[1]", be.inniger.euler.util.Maths.getDivisorsOrdered(1).toString());
    org.junit.Assert.assertEquals("[1, 2]", be.inniger.euler.util.Maths.getDivisorsOrdered(2).toString());
    org.junit.Assert.assertEquals("[1, 2, 3, 6, 7, 14, 21, 42]", be.inniger.euler.util.Maths.getDivisorsOrdered(42).toString());
}