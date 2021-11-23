@org.junit.Test
public void emptyTest() throws java.io.IOException {
    com.spectralogic.ds3client.integration.LazyIterator_Test.HELPERS.ensureBucketExists(com.spectralogic.ds3client.integration.LazyIterator_Test.TEST_ENV_NAME, com.spectralogic.ds3client.integration.LazyIterator_Test.envDataPolicyId);
    try {
        final java.lang.String prefix = "";
        final java.lang.String nextMarker = null;
        final int maxKeys = 100;
        final com.spectralogic.ds3client.helpers.LazyObjectIterable iterable = new com.spectralogic.ds3client.helpers.LazyObjectIterable(com.spectralogic.ds3client.integration.LazyIterator_Test.CLIENT, com.spectralogic.ds3client.integration.LazyIterator_Test.TEST_ENV_NAME, prefix, nextMarker, maxKeys, com.spectralogic.ds3client.integration.LazyIterator_Test.retries);
        final java.util.Iterator<com.spectralogic.ds3client.models.Contents> iterator = iterable.iterator();
        org.junit.Assert.assertFalse(iterator.hasNext());
    } finally {
        com.spectralogic.ds3client.integration.Util.deleteAllContents(com.spectralogic.ds3client.integration.LazyIterator_Test.CLIENT, com.spectralogic.ds3client.integration.LazyIterator_Test.TEST_ENV_NAME);
    }
}