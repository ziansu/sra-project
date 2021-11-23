@org.junit.Test
public void testIsInRange() {
    model.area.RealCoordinate location = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(3, 2));
    assertTrue(area.isInRange(location));
}