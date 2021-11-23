protected static byte[] decodeFirstFrame(byte[] source, int offset, int length, int size) {
    ome.jxrlib.DecodeContext decodeContext = new ome.jxrlib.DecodeContext();
    byte[] destination = new byte[size];
    decodeContext.decodeFirstFrame(source, destination, offset, length);
    return destination;
}