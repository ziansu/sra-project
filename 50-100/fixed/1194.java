@org.junit.Test
public void testEmptyInstance() throws java.lang.Exception {
    org.assertj.jodatime.api.Assertions.assertThat(TimestampStats.EMPTY.min()).isEqualTo(new org.joda.time.DateTime(0L, org.joda.time.DateTimeZone.UTC));
    org.assertj.jodatime.api.Assertions.assertThat(TimestampStats.EMPTY.max()).isEqualTo(new org.joda.time.DateTime(0L, org.joda.time.DateTimeZone.UTC));
}