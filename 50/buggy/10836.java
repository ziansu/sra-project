@org.junit.Test
public void testCylinderSurfaceArea() {
    org.junit.Assert.assertEquals(471.2388, org.cp.elements.lang.MathUtils.cylinderSurfaceArea(5.0, 10.0), 9.9E-5);
}