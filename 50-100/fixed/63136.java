@org.junit.Test
public void testGetLocationById() {
    com.auspost.codingtest.entity.Locations locations = new com.auspost.codingtest.entity.Locations();
    locations.setLocationId(1);
    locations.setPostcode("3024");
    locations.setSuburb("Caroline springs");
    com.auspost.codingtest.entity.Locations location = locationDAO.getLocationById(2);
    assertEquals(location.getPostcode(), "3037");
}