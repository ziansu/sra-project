@org.junit.Test
public void testPow() {
    org.junit.Assert.assertEquals(1, pow(1, 1));
    org.junit.Assert.assertEquals(1, pow(1, 2));
    org.junit.Assert.assertEquals(2, pow(2, 1));
    org.junit.Assert.assertEquals(1024, pow(2, 10));
}