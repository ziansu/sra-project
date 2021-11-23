public void setBlockExtraDataAt(int x, int y, int z, int id, int data) {
    this.getChunk((x >> 4), (z >> 4), true).setBlockExtraData((x & 15), (y & 255), (z & 15), ((data << 8) | id));
    this.sendBlockExtraData(x, y, z, id, data);
}