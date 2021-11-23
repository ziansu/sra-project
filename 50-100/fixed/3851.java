@org.junit.Test
public void shouldReturnSameChecksumOnSecondCall() throws java.io.IOException {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(data);
    chksumChannel.write(buffer, 0);
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}