@org.junit.Test
public void testDownLeftGetLocationsRadius4() {
    area.setDirection(Angle.DOWN_LEFT);
    area.setRange(4);
    java.util.List<model.area.TileCoordinate> locations = area.getCoveredLocations();
    org.junit.Assert.assertEquals(4, locations.size());
    for (model.area.TileCoordinate loc : locations) {
        model.area.TileCoordinate loc2 = loc;
        java.lang.System.out.println((((loc2.getX()) + " ") + (loc2.getY())));
    }
}