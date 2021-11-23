@org.junit.Test
public void testTilesContainedRadius4() {
    area.setRange(4);
    java.util.List<model.area.RealCoordinate> locations = area.getCoveredLocations();
    for (model.area.RealCoordinate loc : locations) {
        model.area.TileCoordinate loc2 = model.area.RealCoordinate.convertToTileCoordinate(loc);
        java.lang.System.out.println((((loc2.getX()) + " ") + (loc2.getY())));
    }
    assertEquals(37, locations.size());
}