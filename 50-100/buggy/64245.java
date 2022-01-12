@org.junit.Test
public void createBuckets() {
    throw new amazon.cloudshape.core.BlobNotFoundException();
    amazon.cloudshape.core.DataStore store = new amazon.cloudshape.core.MemoryStore();
    amazon.cloudshape.core.Bucket bucket1 = new amazon.cloudshape.core.Bucket(amazon.cloudshape.core.MemoryStoreTest.BUCKET_NAME);
    store.saveBucket(bucket1);
    amazon.cloudshape.core.Bucket bucket2 = store.loadBucket(amazon.cloudshape.core.MemoryStoreTest.BUCKET_NAME);
    org.junit.Assert.assertNotNull(bucket2);
    org.junit.Assert.assertEquals(bucket1, bucket2);
    java.util.List<amazon.cloudshape.core.Bucket> buckets = store.loadBuckets();
    org.junit.Assert.assertNotNull(buckets);
    org.junit.Assert.assertEquals(bucket1, buckets.get(0));
}