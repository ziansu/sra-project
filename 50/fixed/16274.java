@org.junit.Test
public void testFewValues() {
    final com.tdunning.math.stats.TDigest digest = new com.tdunning.math.stats.MergingDigest(100);
    fewValues(digest);
}