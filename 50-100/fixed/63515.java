@org.junit.Test
public void testReadInputStream() throws java.io.IOException {
    java.io.InputStream in = org.apache.spark.smstorage.client.io.LocalBlockInputStream.getLocalInputStream("shmget", shmId, applySize);
    org.junit.Assert.assertTrue((in != null));
    byte[] arr = new byte[applySize];
    in.read(arr);
    printByteArrLast(arr, 1000);
    in.close();
}