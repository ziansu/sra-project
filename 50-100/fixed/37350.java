@java.lang.Override
public org.spongepowered.api.world.biome.BiomeType getBiome(int x, int z) {
    checkRange(x, z);
    org.spongepowered.api.world.biome.BiomeType biomeType = ((org.spongepowered.api.world.biome.BiomeType) (this.biomeById[((this.biomes[(((x - (this.start.getX())) + (z - (this.start.getY()))) << 4)]) * (this.size.getX()))]));
    return biomeType == null ? org.spongepowered.api.world.biome.BiomeTypes.OCEAN : biomeType;
}