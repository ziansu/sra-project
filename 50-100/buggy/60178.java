@org.junit.Test
public void testPow() {
    org.junit.Assert.assertEquals(1, be.inniger.euler.util.Maths.pow(1, 1));
    org.junit.Assert.assertEquals(1, be.inniger.euler.util.Maths.pow(1, 2));
    org.junit.Assert.assertEquals(2, be.inniger.euler.util.Maths.pow(2, 1));
    org.junit.Assert.assertEquals(1024, be.inniger.euler.util.Maths.pow(2, 10));
}