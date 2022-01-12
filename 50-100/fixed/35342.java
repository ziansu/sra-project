@org.junit.Test
public void testRemoveHitBox() throws java.lang.Exception {
    bbox.addHitBox(new com.almasb.fxgl.physics.HitBox("ARM", com.almasb.fxgl.physics.BoundingShape.box(40, 40)));
    assertEquals(1, bbox.hitBoxesProperty().size());
    bbox.removeHitBox("arm");
    assertEquals(1, bbox.hitBoxesProperty().size());
    bbox.removeHitBox("ARM");
    assertEquals(0, bbox.hitBoxesProperty().size());
}