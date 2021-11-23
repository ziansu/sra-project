public static int decode(final byte[] sourceBuffer, int offset, int length, final byte[] targetBuffer) throws java.io.IOException {
    return com.ning.compress.lzf.util.ChunkDecoderFactory.optimalInstance().decode(sourceBuffer, offset, length, targetBuffer);
}