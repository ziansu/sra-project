@org.junit.Test
public void commonFactor() throws java.lang.Exception {
    junit.framework.TestCase.assertEquals(2, gcd(6, 8));
    junit.framework.TestCase.assertEquals(7, gcd(49, 315));
    junit.framework.TestCase.assertEquals((-4), gcd(24, (-28)));
}