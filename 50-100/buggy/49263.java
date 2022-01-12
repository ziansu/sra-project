private byte getSkyLight(int x, int y, int z) {
    net.morbz.minecraft.world.Region region = getRegion(x, z, false);
    if (region != null) {
        int blockX = getRegionCoord(x);
        int blockZ = getRegionCoord(z);
        return region.getSkyLight(blockX, y, blockZ);
    }
    return net.morbz.minecraft.world.World.DEFAULT_SKY_LIGHT;
}