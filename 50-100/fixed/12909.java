@org.junit.Test
public void testGetMinYWorld() throws java.lang.Exception {
    bbox.addHitBox(new com.almasb.fxgl.physics.HitBox("ARM", new javafx.geometry.Point2D(0, 20), com.almasb.fxgl.physics.BoundingShape.box(40, 40)));
    assertEquals(20, bbox.getMinYWorld(), 0);
    position.translateY(100);
    assertEquals(120, bbox.getMinYWorld(), 0);
}