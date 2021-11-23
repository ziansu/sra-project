private static void writeAndRead(org.bouncycastle.crypto.tls.TlsProtocol writer, org.bouncycastle.crypto.tls.TlsProtocol reader, byte[] data, boolean fragment) throws java.io.IOException {
    int dataSize = data.length;
    writer.offerOutput(data, 0, dataSize);
    org.bouncycastle.crypto.tls.test.TlsProtocolNonBlockingTest.pumpData(writer, reader, fragment);
    assertEquals(dataSize, reader.getAvailableInputBytes());
    byte[] readData = new byte[dataSize];
    reader.readInput(readData, 0, dataSize);
    org.bouncycastle.crypto.tls.test.TlsProtocolNonBlockingTest.assertArrayEquals(data, readData);
}