@java.lang.Override
public org.spongepowered.api.world.biome.BiomeType getBiome(int x, int z) {
    checkRange(x, z);
    return ((org.spongepowered.api.world.biome.BiomeType) (this.biomes[((x - (this.start.getX())) + ((z - (this.start.getY())) * (this.size.getX())))]));
}