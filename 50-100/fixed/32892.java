@org.junit.Test
public void testWriteStream() throws java.io.IOException {
    java.io.ByteArrayOutputStream stream = new java.io.ByteArrayOutputStream();
    adapter.writeStream(allTypes, stream);
    byte[] output = stream.toByteArray();
    org.assertj.core.api.Assertions.assertThat(output.length).isEqualTo(TestAllTypesData.expectedOutput.size());
    org.assertj.core.api.Assertions.assertThat(okio.ByteString.of(output)).isEqualTo(TestAllTypesData.expectedOutput);
}