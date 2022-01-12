@org.junit.Test
public void testGetMinYWorld() throws java.lang.Exception {
    bbox.addHitBox(new com.almasb.fxgl.physics.HitBox("ARM", new javafx.geometry.Point2D(0, 20), com.almasb.fxgl.physics.BoundingShape.box(40, 40)));
    org.junit.Assert.assertEquals(20, bbox.getMinYWorld(), 0);
    position.translateY(100);
    org.junit.Assert.assertEquals(120, bbox.getMinYWorld(), 0);
}