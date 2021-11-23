public double readBinaryDouble() throws net.rpgtoolkit.common.CorruptAssetException {
    try {
        byte[] byteArray = new byte[8];
        for (int i = 0; i < 8; i++) {
            byteArray[i] = ((byte) (inputStream.read()));
        }
        buffer = java.nio.ByteBuffer.wrap(byteArray);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return buffer.getDouble();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
        return 0;
    }
}