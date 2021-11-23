@org.junit.Test
public void testRowsWithMultipleColumns() throws java.lang.Exception {
    java.util.List<com.google.common.util.concurrent.ListenableFuture<io.crate.core.collections.Bucket>> page1 = io.crate.testing.BucketHelpers.createBucketFutures(java.util.Arrays.asList(new java.lang.Object[]{ "A" , 1 }, new java.lang.Object[]{ "B" , 1 }), java.util.Arrays.asList(new java.lang.Object[]{ "A" , 2 }, new java.lang.Object[]{ "B" , 2 }));
    io.crate.core.collections.Bucket bucket = mergeWith(2, null, page1);
    assertRows(bucket, "A| 1", "A| 2", "B| 1", "B| 2");
}