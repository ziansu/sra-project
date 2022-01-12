@org.junit.Test
public void testReadInputStream2() throws java.io.IOException {
    org.apache.spark.smstorage.client.io.LocalBlockInputStream in = org.apache.spark.smstorage.client.io.LocalBlockInputStream.getLocalInputStream("shmget", java.lang.String.valueOf(shmId), applySize);
    org.junit.Assert.assertTrue((in != null));
    byte[] arr = in.readFully(applySize);
    printByteArrLast(arr, 1000);
    in.close();
}