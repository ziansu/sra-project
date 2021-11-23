private byte getTransparency(int x, int y, int z) {
    int index = getBlockIndex(x, y, z);
    return transparency[index];
}