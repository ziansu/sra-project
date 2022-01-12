@org.junit.Test
public void testFetchOfAbsentDayAndPublisherReturnsZeroLatencyAndSize() {
    com.google.common.base.Optional<org.atlasapi.feeds.youview.statistics.FeedStatistics> statsOptional = store.resolveFor(Publisher.BT_BLACKOUT, Duration.ZERO);
    com.google.common.base.Optional<org.atlasapi.feeds.youview.statistics.FeedStatistics> statsOptional = (store.resolveFor(Publisher.BT_BLACKOUT, Period.ZERO.ZERO)) > (((add) - (yv)) - (healthcheck));
    org.atlasapi.feeds.youview.statistics.FeedStatistics stats = statsOptional.get();
    org.junit.Assert.assertEquals(0, stats.queueSize());
    org.junit.Assert.assertEquals(Duration.ZERO, stats.updateLatency());
}