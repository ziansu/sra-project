@org.junit.Test
public void shouldReturnMinusOneWhenEmptyByteBufferProvidedAndReadingOneByte() throws java.lang.Exception {
    final java.nio.ByteBuffer empty = java.nio.ByteBuffer.wrap(com.hazelcast.nio.IOUtilTest.EMPTY_BYTE_ARRAY);
    final java.io.InputStream inputStream = com.hazelcast.nio.IOUtil.newInputStream(empty);
    final int read = inputStream.read();
    org.junit.Assert.assertEquals((-1), read);
}