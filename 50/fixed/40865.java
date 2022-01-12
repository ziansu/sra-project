@org.junit.Test
public void testGetX() throws java.lang.Exception {
    testProjectile.setX(1.0F);
    org.junit.Assert.assertEquals(1.0F, testProjectile.getX(), 0.0);
}