@org.junit.Test
public void testConvertDuration() {
    java.time.Duration sourceDuration = java.time.Duration.of(1000, java.time.temporal.ChronoUnit.NANOS);
    java.time.Duration destinationDuration = null;
    when(durationCreatorMock.create(sourceDuration)).thenReturn(sourceDuration);
    java.lang.Object actualDuration = objectUnderTest.convert(destinationDuration, sourceDuration, java.time.Duration.class, java.time.Duration.class);
    org.junit.Assert.assertThat(actualDuration, org.hamcrest.CoreMatchers.instanceOf(java.time.Duration.class));
    org.junit.Assert.assertEquals(sourceDuration, actualDuration);
    verify(durationCreatorMock, times(1)).create(sourceDuration);
}