@org.junit.Test
public void shouldReturnMinusOneWhenEmptyByteBufferProvidedAndReadingOneByte() throws java.lang.Exception {
    java.nio.ByteBuffer empty = java.nio.ByteBuffer.wrap(com.hazelcast.nio.IOUtilTest.EMPTY_BYTE_ARRAY);
    java.io.InputStream inputStream = com.hazelcast.nio.IOUtil.newInputStream(empty);
    int read = inputStream.read();
    org.junit.Assert.assertEquals((-1), read);
}