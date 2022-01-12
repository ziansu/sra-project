@org.junit.Test
public void shouldSucceedIfWrittenOutOfOrderWithSingleBuffer() throws java.io.IOException {
    int[] blockorder = getRandomPermutationOfBlockOrder();
    for (int i = 0; i < (blockcount); i++) {
        chksumChannel.position(((blockorder[i]) * (blocksize)));
        chksumChannel.write(buffers[blockorder[i]]);
    }
    assertThat(chksumChannel.getChecksum(), equalTo(expectedChecksum));
}