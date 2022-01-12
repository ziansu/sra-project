@org.junit.Test
public void reflexive() throws java.lang.Exception {
    junit.framework.TestCase.assertEquals(1, gcd(1, 1));
    junit.framework.TestCase.assertEquals(1, gcd(1, 1));
    junit.framework.TestCase.assertEquals(1, gcd((-1), (-1)));
}