@org.junit.Test
public void testCalculateSmallFactorial() {
    org.junit.Assert.assertEquals(1, calculateSmallFactorial(1));
    org.junit.Assert.assertEquals(2, calculateSmallFactorial(2));
    org.junit.Assert.assertEquals(6, calculateSmallFactorial(3));
    org.junit.Assert.assertEquals(479001600, calculateSmallFactorial(12));
}