private byte[] intToByte2(int i, byte[] target, int offset) {
    target[(offset + 1)] = ((byte) (i & 255));
    target[offset] = ((byte) ((i >> 8) & 255));
    return target;
}