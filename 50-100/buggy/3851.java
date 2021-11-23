@org.junit.Test
public void shouldReturnSameChecksumOnSecondCall() throws java.io.IOException {
    java.nio.ByteBuffer buffer = java.nio.ByteBuffer.wrap(data);
    chksumChannel.write(buffer, 0);
    assertThat(chksumChannel.getChecksum(), org.hamcrest.Matchers.equalTo(expectedChecksum));
    assertThat(chksumChannel.getChecksum(), org.hamcrest.Matchers.equalTo(expectedChecksum));
}