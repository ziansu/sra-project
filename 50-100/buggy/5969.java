@org.junit.Test
public void testCalculateSmallFactorial() {
    org.junit.Assert.assertEquals(1, be.inniger.euler.util.Maths.calculateSmallFactorial(1));
    org.junit.Assert.assertEquals(2, be.inniger.euler.util.Maths.calculateSmallFactorial(2));
    org.junit.Assert.assertEquals(6, be.inniger.euler.util.Maths.calculateSmallFactorial(3));
    org.junit.Assert.assertEquals(479001600, be.inniger.euler.util.Maths.calculateSmallFactorial(12));
}