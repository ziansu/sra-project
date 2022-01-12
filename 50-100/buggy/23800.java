@org.junit.Test
public void testIsAmicable() {
    org.junit.Assert.assertFalse(be.inniger.euler.util.Maths.isAmicable(1));
    org.junit.Assert.assertFalse(be.inniger.euler.util.Maths.isAmicable(2));
    org.junit.Assert.assertFalse(be.inniger.euler.util.Maths.isAmicable(42));
    org.junit.Assert.assertTrue(be.inniger.euler.util.Maths.isAmicable(220));
    org.junit.Assert.assertTrue(be.inniger.euler.util.Maths.isAmicable(284));
}