@org.openjdk.jmh.annotations.Warmup(iterations = 20)
@org.openjdk.jmh.annotations.Measurement(iterations = 10)
@org.openjdk.jmh.annotations.GenerateMicroBenchmark
public void aggregateByCategory_parallel_lazy_jdk() {
    java.util.Map<java.lang.String, java.util.DoubleSummaryStatistics> productDoubleMap = this.jdkPositions.parallelStream().collect(java.util.stream.Collectors.groupingBy(com.gs.collections.impl.jmh.AggregateByTest.Position::getCategory, java.util.stream.Collectors.summarizingDouble(com.gs.collections.impl.jmh.AggregateByTest.Position::getMarketValue)));
    org.junit.Assert.assertNotNull(productDoubleMap);
}