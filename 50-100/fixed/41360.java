@org.junit.Test
public void shouldReturnNullDigestOnDoubleWrites() throws java.io.IOException {
    chksumChannel.write(buffers[0], 0);
    buffers[0].rewind();
    chksumChannel.write(buffers[0], 0);
    assertThat(chksumChannel.getChecksum(), equalTo(null));
}