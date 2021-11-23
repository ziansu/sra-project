@org.junit.Test
public void closeOutputStreamOnClose() throws java.io.IOException {
    final java.io.OutputStream mock = org.mockito.Mockito.mock(java.io.OutputStream.class);
    final java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(mock);
    osw.close();
    verify(mock).close();
}