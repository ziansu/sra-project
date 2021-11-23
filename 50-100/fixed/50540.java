@org.junit.Test
public void shouldSucceedIfWrittenInOrderWithMultipleBuffersAndOffset() throws java.io.IOException {
    java.nio.ByteBuffer[] buffers = new java.nio.ByteBuffer[(blockcount) + 2];
    buffers[0] = this.buffers[((blockcount) - 1)];
    buffers[blockcount] = this.buffers[0];
    java.lang.System.arraycopy(this.buffers, 0, buffers, 1, blockcount);
    chksumChannel.write(buffers, 1, blockcount);
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}