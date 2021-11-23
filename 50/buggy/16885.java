private void checkWrittenChunks(int totalFrameSize, com.rabbitmq.client.test.FrameTest.AccumulatorWritableByteChannel channel) {
    int totalWritten = 0;
    for (byte[] chunk : channel.chunks) {
        totalWritten += chunk.length;
    }
    org.junit.Assert.assertThat(totalWritten, org.hamcrest.Matchers.equalTo(totalFrameSize));
}