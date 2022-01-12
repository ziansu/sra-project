public void testTryWriteToFull() throws java.lang.Exception {
    _testTryWriteToFull(SegType.BYTE_ARRAY);
    _testTryWriteToFull(SegType.BYTE_BUFFER_FAKE);
    _testTryWriteToFull(SegType.BYTE_BUFFER_DIRECT);
}