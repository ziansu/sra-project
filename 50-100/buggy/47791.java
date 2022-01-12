@org.junit.Test
public void testConvertLocalTime() {
    java.time.LocalTime sourceLocalTime = java.time.LocalTime.now();
    java.time.LocalTime destinationLocalTime = null;
    when(localTimeCreatorMock.create(sourceLocalTime)).thenReturn(sourceLocalTime);
    java.lang.Object actualLocalTime = objectUnderTest.convert(destinationLocalTime, sourceLocalTime, java.time.LocalTime.class, java.time.LocalTime.class);
    org.junit.Assert.assertThat(actualLocalTime, org.hamcrest.CoreMatchers.instanceOf(java.time.LocalTime.class));
    org.junit.Assert.assertEquals(sourceLocalTime, actualLocalTime);
    verify(localTimeCreatorMock, times(1)).create(sourceLocalTime);
}