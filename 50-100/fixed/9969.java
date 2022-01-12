@org.junit.Test
public void testGetPart() {
    org.junit.Assert.assertEquals(123456789, getPart(123456789, 0, 9));
    org.junit.Assert.assertEquals(23456789, getPart(123456789, 1, 9));
    org.junit.Assert.assertEquals(12345678, getPart(123456789, 0, 8));
    org.junit.Assert.assertEquals(345, getPart(123456789, 2, 5));
}