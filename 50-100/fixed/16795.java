@org.junit.Test
public void testCalculateFactorial() {
    org.junit.Assert.assertEquals("1", calculateFactorial(0).toString());
    org.junit.Assert.assertEquals("1", calculateFactorial(1).toString());
    org.junit.Assert.assertEquals("2", calculateFactorial(2).toString());
    org.junit.Assert.assertEquals("6", calculateFactorial(3).toString());
    org.junit.Assert.assertEquals("1405006117752879898543142606244511569936384000000000", calculateFactorial(42).toString());
}