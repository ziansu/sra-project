@org.junit.Test
public void putObjectUnderNonExistentBucket() throws java.lang.Exception {
    final java.lang.String bucket = "non-existent-bucket";
    final java.lang.String objectKey = (bucket + (alluxio.AlluxioURI.SEPARATOR)) + "object.txt";
    java.lang.String message = "hello world";
    try {
        createObjectRestCall(objectKey, message.getBytes(), null);
        org.junit.Assert.fail("create object under non-existent bucket should fail");
    } catch (java.lang.AssertionError e) {
    }
}