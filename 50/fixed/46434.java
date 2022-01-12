@org.junit.Test(expected = LocationOutOfBoundsException.class)
public void constructOutOfBoundsLow() {
    Location badlyConstrainedLocation = new Location(10, 20, 11);
}