@org.openjdk.jmh.annotations.Warmup(iterations = 20)
@org.openjdk.jmh.annotations.Measurement(iterations = 10)
@org.openjdk.jmh.annotations.GenerateMicroBenchmark
public java.util.Map<com.gs.collections.impl.jmh.AggregateByTest.Product, java.util.DoubleSummaryStatistics> aggregateByProduct_parallel_lazy_jdk() {
    java.util.Map<com.gs.collections.impl.jmh.AggregateByTest.Product, java.util.DoubleSummaryStatistics> result = this.jdkPositions.parallelStream().collect(java.util.stream.Collectors.groupingBy(com.gs.collections.impl.jmh.AggregateByTest.Position::getProduct, java.util.stream.Collectors.summarizingDouble(com.gs.collections.impl.jmh.AggregateByTest.Position::getMarketValue)));
    org.junit.Assert.assertNotNull(result);
    return result;
}