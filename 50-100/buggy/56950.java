@org.junit.Before
public void setUp() throws java.lang.Exception {
    long mockDateMillis = new org.joda.time.DateTime(2017, 10, 12, 16, 39).getMillis();
    org.joda.time.DateTimeUtils.setCurrentMillisFixed(mockDateMillis);
    org.powermock.api.mockito.PowerMockito.whenNew(org.joda.time.DateTime.class).withNoArguments().thenReturn(new org.joda.time.DateTime());
}