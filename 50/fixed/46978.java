@org.junit.Test
public void testInsideAreaUpRightTrue() {
    area.setDirection(Angle.UP_RIGHT);
    model.area.TileCoordinate loc = new model.area.TileCoordinate(11, 9);
    org.junit.Assert.assertTrue(area.isInRange(loc));
}