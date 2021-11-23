public long readBinaryLong() throws net.rpgtoolkit.common.CorruptAssetException {
    try {
        byte[] byteArray = new byte[4];
        for (int i = 0; i < 4; i++) {
            byteArray[i] = ((byte) (inputStream.read()));
        }
        buffer = java.nio.ByteBuffer.wrap(byteArray);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return buffer.getInt();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
        return 0;
    }
}