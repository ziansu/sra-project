@org.junit.Test
public void shouldSucceedIfWrittenInOrderWithMultipleBuffers() throws java.io.IOException {
    chksumChannel.write(buffers);
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}