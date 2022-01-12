public static byte[] decode(final byte[] inputBuffer, int offset, int length) throws java.io.IOException {
    return com.ning.compress.lzf.util.ChunkDecoderFactory.optimalInstance().decode(inputBuffer, offset, length);
}