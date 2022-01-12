@org.junit.Test
public void testAddResult() throws java.io.IOException, java.lang.InterruptedException {
    com.google.bigtable.v1.ReadRowsResponse response = com.google.bigtable.v1.ReadRowsResponse.getDefaultInstance();
    scanner.addResult(response);
    org.mockito.Mockito.verify(reader, org.mockito.Mockito.times(1)).add(org.mockito.Matchers.eq(com.google.cloud.bigtable.grpc.scanner.ResultQueueEntry.newResult(response)));
    assertChannelReturned(0);
    scanner.close();
}