@org.junit.Test
public void testWriteBytes() throws java.io.IOException {
    byte[] output = adapter.writeBytes(allTypes);
    org.assertj.core.api.Assertions.assertThat(output.length).isEqualTo(TestAllTypesData.expectedOutput.length);
    org.assertj.core.api.Assertions.assertThat(okio.ByteString.of(output)).isEqualTo(okio.ByteString.of(TestAllTypesData.expectedOutput));
}