private static byte[] activate(byte[] pins) {
    byte[] bytes = new byte[((pins.length) * 3) + 1];
    int offset = 0;
    for (byte i : pins) {
        bytes[offset] = 12;
        bytes[(offset + 1)] = i;
        bytes[(offset + 2)] = 1;
        offset += 3;
    }
    bytes[offset] = 14;
    return bytes;
}