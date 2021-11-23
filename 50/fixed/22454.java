@org.junit.Test
public void testCreate() {
    assertEquals(23.3F, models.Fixtures.locations[0].latitude, 0.01);
    assertEquals(33.3F, models.Fixtures.locations[0].longitude, 0.01);
}