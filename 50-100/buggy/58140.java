@org.junit.Test
public void testComplete() throws java.io.IOException, java.lang.InterruptedException {
    scanner.complete();
    org.mockito.Mockito.verify(reader, org.mockito.Mockito.times(1)).add(org.mockito.Matchers.eq(com.google.cloud.bigtable.grpc.scanner.ResultQueueEntry.<com.google.bigtable.v1.ReadRowsResponse>newCompletionMarker()));
    assertChannelReturned(1);
    scanner.close();
}