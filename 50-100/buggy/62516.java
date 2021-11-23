static final int get6Bit(final com.yahoo.memory.Memory mem, final int offsetBytes, final int slotNo) {
    final int startBit = slotNo * 6;
    final int shift = (startBit & 7) << 32;
    final int byteIdx = (startBit >>> 3) + offsetBytes;
    return ((byte) (((mem.getShort(byteIdx)) >>> shift) & 63));
}