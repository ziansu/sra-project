@org.junit.Test
public void testAllBucketsAreEmpty() throws java.lang.Exception {
    java.util.List<com.google.common.util.concurrent.ListenableFuture<io.crate.core.collections.Bucket>> p1Buckets = io.crate.testing.BucketHelpers.createBucketFutures(java.util.Arrays.<java.lang.Object[]>asList(), java.util.Arrays.<java.lang.Object[]>asList());
    io.crate.core.collections.Bucket bucket = mergeWith(2, 0, 11, p1Buckets);
    assertThat(bucket.size(), org.hamcrest.Matchers.is(0));
}