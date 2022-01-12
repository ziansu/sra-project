public int readBinaryInteger() throws net.rpgtoolkit.common.CorruptAssetException {
    try {
        byte[] byteArray = new byte[2];
        for (int i = 0; i < 2; i++) {
            byteArray[i] = ((byte) (inputStream.read()));
        }
        buffer = java.nio.ByteBuffer.wrap(byteArray);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return buffer.getShort();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return 0;
    }
}