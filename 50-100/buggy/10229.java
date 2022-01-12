@org.junit.Test
public void testCreateBeanForPeriod() {
    java.time.Period sourcePeriod = java.time.Period.of(2015, 11, 8);
    java.time.Period destinationPeriod = null;
    when(periodCreatorMock.create(sourcePeriod)).thenReturn(sourcePeriod);
    java.lang.Object actualPeriod = objectUnderTest.convert(destinationPeriod, sourcePeriod, java.time.Period.class, java.time.Period.class);
    org.junit.Assert.assertThat(actualPeriod, org.hamcrest.CoreMatchers.instanceOf(java.time.Period.class));
    org.junit.Assert.assertEquals(sourcePeriod, actualPeriod);
    verify(periodCreatorMock, times(1)).create(sourcePeriod);
}