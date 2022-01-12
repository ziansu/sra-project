@org.junit.Test
public void testConvertZoneId() {
    java.time.ZoneId sourceZoneId = java.time.ZoneId.of("Europe/Berlin");
    java.time.ZoneId destinationZoneId = null;
    when(zoneIdCreatorMock.create(sourceZoneId)).thenReturn(sourceZoneId);
    java.lang.Object actualZoneId = objectUnderTest.convert(destinationZoneId, sourceZoneId, java.time.ZoneId.class, java.time.ZoneId.class);
    org.junit.Assert.assertThat(actualZoneId, org.hamcrest.CoreMatchers.instanceOf(java.time.ZoneId.class));
    org.junit.Assert.assertEquals(sourceZoneId, actualZoneId);
    verify(zoneIdCreatorMock, times(1)).create(sourceZoneId);
}