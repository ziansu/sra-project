@org.junit.Test
public void shouldSucceedIfWrittenOutOfOrderWithPosition() throws java.io.IOException {
    int[] blockorder = getRandomPermutationOfBlockOrder();
    for (int i = 0; i < (blockcount); i++) {
        chksumChannel.write(buffers[blockorder[i]], ((blockorder[i]) * (blocksize)));
    }
    assertThat(chksumChannel.getChecksum(), org.hamcrest.Matchers.equalTo(expectedChecksum));
}