public int getBlock(int x, int y, int z) {
    try {
        return blocks[x][y][z];
    } catch (java.lang.Exception e) {
    }
    return -1;
}