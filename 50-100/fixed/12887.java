@org.junit.Test
public void shouldReturnNullDigestOnPartlyOverlappingWrites() throws java.io.IOException {
    chksumChannel.write(buffers[1], blocksize);
    chksumChannel.write(buffers[0], ((blocksize) - 1));
    if ((blocksize) == 1) {
        fail("Pick a blocksize > 1 for testing correct handling of partly overlapping writes!");
    }
    assertThat(chksumChannel.getChecksum(), equalTo(null));
}