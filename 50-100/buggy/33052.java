@org.junit.Test
public void relativelyPrime() throws java.lang.Exception {
    junit.framework.TestCase.assertEquals(1, gcd(2, 3));
    junit.framework.TestCase.assertEquals(1, gcd(4, 7));
    junit.framework.TestCase.assertEquals((-1), gcd((-2), (-3)));
}