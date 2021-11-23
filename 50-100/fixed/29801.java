@org.junit.Test
public void testLongerExtent() {
    java.util.List<com.spotify.heroic.metric.Point> input = build().add(0, 1.0).add(1000, 1.0).add(1000, 1.0).add(2000, 1.0).result();
    java.util.List<com.spotify.heroic.metric.Point> expected = build().add(1000, 3.0).add(2000, 3.0).add(3000, 1.0).result();
    checkBucketAggregation(input, expected, 2000);
}