@org.junit.Test
public void deleteNonExistingBucket() throws java.lang.Exception {
    final java.lang.String bucketName = "non-existing-bucket";
    try {
        deleteBucketRestCall(bucketName);
        org.junit.Assert.fail("delete a non-existing bucket should fail");
    } catch (java.lang.AssertionError e) {
    }
}