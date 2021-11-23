protected byte[] createDataPacket(int blockNum) {
    return new byte[]{ 0 , 3 , ((byte) (blockNum & 255)) , ((byte) ((blockNum >>> 8) & 255)) };
}