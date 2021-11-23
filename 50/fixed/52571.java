@org.junit.Test
public void testInsideAreaUpLeftTrue() {
    area.setDirection(Angle.UP_LEFT);
    model.area.TileCoordinate loc = new model.area.TileCoordinate(9, 9);
    org.junit.Assert.assertTrue(area.isInRange(loc));
}