@org.junit.Test
public void getLocation() {
    int x = 10;
    int y = 20;
    int max = 100;
    Location constrainedLocation = new Location(x, y, max);
    assertEquals(x, constrainedLocation.getCoordinate(Location.Coordinate.FIRST));
    assertEquals(y, constrainedLocation.getCoordinate(Location.Coordinate.SECOND));
}