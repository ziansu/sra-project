@org.junit.Test
public void shouldSucceedIfWrittenInOrder() throws java.io.IOException {
    for (int block = 0; block < (blockcount); block++) {
        chksumChannel.write(buffers[block], (block * (blocksize)));
    }
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}