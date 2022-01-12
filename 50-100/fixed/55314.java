@org.junit.Test
@com.lordofthejars.nosqlunit.annotation.UsingDataSet(locations = "EsIndexRangeServiceTest-EmptyIndex.json", loadStrategy = com.lordofthejars.nosqlunit.core.LoadStrategyEnum.CLEAN_INSERT)
public void testTimestampStatsOfIndexWithEmptyIndex() throws java.lang.Exception {
    org.graylog2.indexer.searches.TimestampStats stats = indexRangeService.timestampStatsOfIndex("graylog");
    org.assertj.core.api.Assertions.assertThat(stats.min()).isEqualTo(new org.joda.time.DateTime(0L, org.joda.time.DateTimeZone.UTC));
    org.assertj.core.api.Assertions.assertThat(stats.max()).isEqualTo(new org.joda.time.DateTime(0L, org.joda.time.DateTimeZone.UTC));
}