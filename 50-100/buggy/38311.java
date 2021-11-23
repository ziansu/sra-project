@org.junit.Test
public void testMoveDirectionDouble() {
    com.github.fishio.BoundingBox bb = new com.github.fishio.BoundingBox(1.0, 2.0, 3.0, 4.0);
    bb.move(Direction.UP, 1.0);
    org.junit.Assert.assertEquals(1.0, bb.getMinX(), 1.0E-7);
    org.junit.Assert.assertEquals(3.0, bb.getMinY(), 1.0E-7);
    org.junit.Assert.assertEquals(3.0, bb.getMaxX(), 1.0E-7);
    org.junit.Assert.assertEquals(5.0, bb.getMaxY(), 1.0E-7);
}