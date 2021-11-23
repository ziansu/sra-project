@org.junit.Test
public void shouldReturnAppendOnlyOutPutStream() throws java.io.IOException {
    org.spike.domain.RemoteFile remoteFile = new builders.RemoteFileBuilder().build();
    org.spike.io.Worker worker = new org.spike.io.Worker(remoteFile, httpRangeConnection, 1024, callback);
    worker.write();
    org.mockito.Mockito.verify(stubInputStream).read(org.mockito.Mockito.anyObject(), org.mockito.Mockito.anyInt(), org.mockito.Mockito.anyInt());
}