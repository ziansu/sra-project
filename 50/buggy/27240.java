@org.junit.Test
public void testIsNotInRange() {
    model.area.RealCoordinate location = model.area.TileCoordinate.convertToRealCoordinate(new model.area.TileCoordinate(0, 3));
    area.setRange(4);
    assertFalse(area.isInRange(location));
}