@org.junit.Test
public void shouldFillUpRangeGapsWithZerosOnGetChecksum() throws java.io.IOException {
    java.util.Map<java.lang.Long, java.nio.ByteBuffer> nonZeroBlocksFromByteArray = getNonZeroBlocksFromByteArray(data);
    for (java.lang.Long position : nonZeroBlocksFromByteArray.keySet()) {
        chksumChannel.write(nonZeroBlocksFromByteArray.get(position), position);
    }
    assertThat(chksumChannel.getChecksum(), org.hamcrest.Matchers.equalTo(expectedChecksum));
}