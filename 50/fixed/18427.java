@org.junit.Test
public void testIsInRange() {
    model.area.TileCoordinate location = new model.area.TileCoordinate(3, 2);
    assertTrue(area.isInRange(location));
}