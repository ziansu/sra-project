@org.junit.Test
public void queueLatencyIsReportedCorrectly() {
    org.joda.time.DateTime now = org.joda.time.DateTime.now();
    org.joda.time.DateTime created = now.minusDays(1);
    taskStore.save(getTask(44L, created));
    clock.jumpTo(now);
    org.junit.Assert.assertEquals(org.joda.time.Duration.standardDays(1), store.resolveFor(org.atlasapi.feeds.youview.statistics.MongoFeedStatisticsStoreTest.PUBLISHER, new org.joda.time.Duration(1L)).get().updateLatency());
}