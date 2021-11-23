private static java.nio.ByteBuffer setUpBuffer(java.nio.ByteBuffer sector, int value) {
    sector.clear();
    java.lang.Byte byteValue = ((byte) (0));
    while (sector.hasRemaining()) {
        sector.put(byteValue);
    } 
    sector.flip();
    return sector;
}