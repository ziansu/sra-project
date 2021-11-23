@org.junit.Test
public void testDownLeftGetLocationsRadius4() {
    area.setDirection(Angle.DOWN_LEFT);
    area.setRange(4);
    java.util.List<model.area.RealCoordinate> locations = area.getCoveredLocations();
    org.junit.Assert.assertEquals(4, locations.size());
    for (model.area.RealCoordinate loc : locations) {
        model.area.TileCoordinate loc2 = model.area.RealCoordinate.convertToTileCoordinate(loc);
        java.lang.System.out.println((((loc2.getX()) + " ") + (loc2.getY())));
    }
}