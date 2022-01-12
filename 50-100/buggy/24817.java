@org.junit.Test
public void testGetBounds() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertEquals("lts.getBounds() is equal to...", new java.awt.geom.Rectangle2D.Double(30.20101012677667, 85.85786437626905, 39.59797974644667, 28.284271247461902), lts.getBounds());
    java.awt.geom.Rectangle2D b = ltd.getBounds();
    org.junit.Assert.assertEquals("ltd.getBounds() is equal to...", new java.awt.geom.Rectangle2D.Double(30.20101012677667, 85.85786437626905, 39.59797974644667, 28.284271247461902), lts.getBounds());
}