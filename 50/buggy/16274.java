@org.junit.Test
public void testFewValues() {
    org.junit.Assume.assumeTrue("true".equals(java.lang.System.getProperty("runDisabledTests", "false")));
    final com.tdunning.math.stats.TDigest digest = new com.tdunning.math.stats.MergingDigest(100);
    fewValues(digest);
}