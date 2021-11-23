public me.lukas81298.flexmc.world.BlockState getBlockAt(int x, int y, int z) {
    me.lukas81298.flexmc.world.chunk.ChunkSection section = this.sections[(y / 16)];
    int j = section.getBlock(x, (y & 15), z);
    int type = j >> 4;
    int data = j & 15;
    return new me.lukas81298.flexmc.world.BlockState(type, data);
}