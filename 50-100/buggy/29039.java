public void testDecodeWithIncompleteHeader() throws java.io.IOException {
    org.elasticsearch.common.io.stream.BytesStreamOutput streamOutput = new org.elasticsearch.common.io.stream.BytesStreamOutput(frameDecoder.nextReadLength());
    streamOutput.write('E');
    streamOutput.write('S');
    streamOutput.write(1);
    streamOutput.write(1);
    assertNull(frameDecoder.decode(streamOutput.bytes()));
    assertEquals(((1024 * 16) - 4), frameDecoder.nextReadLength());
}