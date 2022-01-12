@org.junit.Test
public void testIsAmicable() {
    org.junit.Assert.assertFalse(isAmicable(1));
    org.junit.Assert.assertFalse(isAmicable(2));
    org.junit.Assert.assertFalse(isAmicable(42));
    org.junit.Assert.assertTrue(isAmicable(220));
    org.junit.Assert.assertTrue(isAmicable(284));
}