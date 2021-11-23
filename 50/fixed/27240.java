@org.junit.Test
public void testIsNotInRange() {
    model.area.TileCoordinate location = new model.area.TileCoordinate(0, 3);
    area.setRange(4);
    assertFalse(area.isInRange(location));
}