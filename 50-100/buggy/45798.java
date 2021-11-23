@org.junit.Test
public void putDateTimeRfc1123Valid() throws java.lang.Exception {
    fixtures.bodyarray.ArrayTests.client.getArrayOperations().putDateTimeRfc1123Valid(java.util.Arrays.asList(new com.microsoft.rest.DateTimeRfc1123(new org.joda.time.DateTime(2000, 12, 1, 0, 0, 1, org.joda.time.DateTimeZone.UTC)), new com.microsoft.rest.DateTimeRfc1123(new org.joda.time.DateTime(1980, 1, 2, 0, 11, 35, org.joda.time.DateTimeZone.UTC)), new com.microsoft.rest.DateTimeRfc1123(new org.joda.time.DateTime(1492, 10, 12, 10, 15, 1, org.joda.time.DateTimeZone.UTC))));
}