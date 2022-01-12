public static byte[] readByteArray(io.netty.buffer.ByteBuf buffer) {
    final int arraySize = buffer.readInt();
    byte[] data = new byte[arraySize];
    buffer.getBytes(buffer.readerIndex(), data, 0, arraySize);
    buffer.readerIndex(((buffer.readerIndex()) + arraySize));
    return radixcore.modules.RadixNettyIO.decompress(data);
}