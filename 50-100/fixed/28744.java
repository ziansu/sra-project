@org.junit.Test
public void testSetException() throws java.io.IOException, java.lang.InterruptedException {
    java.io.IOException e = new java.io.IOException("Some exception");
    scanner.setError(e);
    org.mockito.Mockito.verify(reader, org.mockito.Mockito.times(1)).add(org.mockito.Matchers.eq(com.google.cloud.bigtable.grpc.scanner.ResultQueueEntry.<com.google.bigtable.v1.ReadRowsResponse>newThrowable(e)));
    scanner.close();
}