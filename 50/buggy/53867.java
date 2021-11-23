@org.junit.Test
public void testEquilateralTriangleArea() {
    org.junit.Assert.assertEquals(10.825, org.cp.elements.lang.MathUtils.equilateralTriangleArea(5.0), 4.0E-4);
}