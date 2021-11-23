@org.junit.Test
public void testInsideAreaUpRightTrue() {
    area.setDirection(Angle.UP_RIGHT);
    model.area.RealCoordinate loc = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(11, 9));
    org.junit.Assert.assertTrue(area.isInRange(loc));
}