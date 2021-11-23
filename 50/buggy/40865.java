@org.junit.Test
public void testGetX() throws java.lang.Exception {
    testProjectile.setX(1);
    org.junit.Assert.assertEquals(1, testProjectile.getX());
}