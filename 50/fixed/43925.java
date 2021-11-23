@org.junit.Test
public void testWriteSource() throws java.io.IOException {
    okio.Buffer sink = new okio.Buffer();
    adapter.write(allTypes, sink);
    org.assertj.core.api.Assertions.assertThat(sink.readByteString()).isEqualTo(TestAllTypesData.expectedOutput);
}