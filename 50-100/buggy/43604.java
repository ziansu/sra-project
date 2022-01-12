public void setBlocks(int x, int z, net.morbz.minecraft.blocks.IBlock[] blocks) {
    for (int y = 0; y < (blocks.length); ++y) {
        setBlock(x, y, z, blocks[y]);
    }
    heightMap[x][z] = 0;
    calculateHeightMap(x, z);
    addSkyLight(x, z);
    spreadSkylightDownwards(x, z);
}