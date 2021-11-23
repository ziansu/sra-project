@org.junit.Test
public void shouldSucceedIfWrittenAtOnce() throws java.io.IOException {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(data);
    chksumChannel.write(buffer, 0);
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}