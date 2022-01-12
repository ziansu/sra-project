@org.openjdk.jmh.annotations.Warmup(iterations = 20)
@org.openjdk.jmh.annotations.Measurement(iterations = 10)
@org.openjdk.jmh.annotations.GenerateMicroBenchmark
public com.gs.collections.api.map.MapIterable<com.gs.collections.impl.jmh.AggregateByTest.Account, com.gs.collections.impl.jmh.AggregateByTest.MarketValueStatistics> aggregateInPlaceByAccount_parallel_lazy_gsc() {
    com.gs.collections.api.map.MapIterable<com.gs.collections.impl.jmh.AggregateByTest.Account, com.gs.collections.impl.jmh.AggregateByTest.MarketValueStatistics> result = this.gscPositions.asParallel(this.executorService, com.gs.collections.impl.jmh.AggregateByTest.BATCH_SIZE).aggregateInPlaceBy(com.gs.collections.impl.jmh.AggregateByTest.Position::getAccount, com.gs.collections.impl.jmh.AggregateByTest.MarketValueStatistics::new, com.gs.collections.impl.jmh.AggregateByTest.MarketValueStatistics::syncAccept);
    org.junit.Assert.assertNotNull(result);
    return result;
}