@org.junit.Test
public void testInsideAreaUpTrue() {
    model.area.RealCoordinate loc = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(10, 9));
    org.junit.Assert.assertTrue(area.isInRange(loc));
}