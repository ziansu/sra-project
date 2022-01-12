@org.junit.Test
public void shouldReadWholeByteBuffer() throws java.lang.Exception {
    java.nio.ByteBuffer empty = java.nio.ByteBuffer.wrap(new byte[com.hazelcast.nio.IOUtilTest.SIZE]);
    java.io.InputStream inputStream = com.hazelcast.nio.IOUtil.newInputStream(empty);
    int read = inputStream.read(new byte[com.hazelcast.nio.IOUtilTest.SIZE]);
    org.junit.Assert.assertEquals(com.hazelcast.nio.IOUtilTest.SIZE, read);
}