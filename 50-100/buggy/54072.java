@org.junit.Test
public void shouldReadWholeByteBuffer() throws java.lang.Exception {
    final java.nio.ByteBuffer empty = java.nio.ByteBuffer.wrap(new byte[com.hazelcast.nio.IOUtilTest.SIZE]);
    final java.io.InputStream inputStream = com.hazelcast.nio.IOUtil.newInputStream(empty);
    final int read = inputStream.read(new byte[com.hazelcast.nio.IOUtilTest.SIZE]);
    org.junit.Assert.assertEquals(3, read);
}