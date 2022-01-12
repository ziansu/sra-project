public void setBlockSkyLightAt(int x, int y, int z, int level) {
    this.getChunk((x >> 4), (z >> 4), true).setBlockSkyLight((x & 15), y, (z & 15), (level & 15));
}