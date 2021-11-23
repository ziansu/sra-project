@org.junit.Test
public void testGetMinXWorld() throws java.lang.Exception {
    bbox.addHitBox(new com.almasb.fxgl.physics.HitBox("ARM", new javafx.geometry.Point2D(20, 0), com.almasb.fxgl.physics.BoundingShape.box(40, 40)));
    org.junit.Assert.assertEquals(20, bbox.getMinXWorld(), 0);
    position.translateX(100);
    org.junit.Assert.assertEquals(120, bbox.getMinXWorld(), 0);
}