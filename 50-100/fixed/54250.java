@org.junit.Test
public void putObjectWithWrongMD5() throws java.lang.Exception {
    final java.lang.String bucket = "bucket";
    createBucketRestCall(bucket);
    final java.lang.String objectKey = (bucket + (alluxio.AlluxioURI.SEPARATOR)) + "object.txt";
    java.lang.String message = "hello world";
    try {
        java.lang.String wrongMD5 = com.google.common.io.BaseEncoding.base64().encode(message.getBytes());
        createObjectRestCall(objectKey, message.getBytes(), wrongMD5);
    } catch (java.lang.AssertionError e) {
        return ;
    }
    org.junit.Assert.fail("create object with wrong Content-MD5 should fail");
}