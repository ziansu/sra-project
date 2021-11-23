@org.junit.Test
public void testInsideAreaUpFalse() {
    model.area.RealCoordinate loc = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(10, 11));
    org.junit.Assert.assertFalse(area.isInRange(loc));
}