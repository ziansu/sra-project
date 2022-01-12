@org.junit.Test
public void testSeek() throws java.lang.Exception {
    final ch.cyberduck.core.io.FileBuffer buffer = new ch.cyberduck.core.io.FileBuffer();
    org.junit.Assert.assertEquals(0L, buffer.length(), 0L);
    final byte[] chunk = org.apache.commons.lang3.RandomUtils.nextBytes(100);
    buffer.write(chunk, 0L);
    org.junit.Assert.assertEquals(100L, buffer.length(), 0L);
    buffer.read(new byte[20], 1L);
    org.junit.Assert.assertEquals(100L, buffer.length(), 0L);
}