@org.junit.Test
public void testRemoveHitBox() throws java.lang.Exception {
    bbox.addHitBox(new com.almasb.fxgl.physics.HitBox("ARM", com.almasb.fxgl.physics.BoundingShape.box(40, 40)));
    org.junit.Assert.assertEquals(1, bbox.hitBoxesProperty().size());
    bbox.removeHitBox("arm");
    org.junit.Assert.assertEquals(1, bbox.hitBoxesProperty().size());
    bbox.removeHitBox("ARM");
    org.junit.Assert.assertEquals(0, bbox.hitBoxesProperty().size());
}