@org.junit.Test
public void testCreate() {
    assertEquals(0.01, 23.3F, models.Fixtures.locations[0].latitude);
    assertEquals(0.01, 33.3F, models.Fixtures.locations[0].longitude);
}