@java.lang.Override
public org.spongepowered.api.world.biome.BiomeType getBiome(int x, int z) {
    checkOpen();
    byte biomeId = this.biomes[((x - (this.start.getX())) | ((z - (this.start.getY())) << 4))];
    org.spongepowered.api.world.biome.BiomeType biomeType = ((org.spongepowered.api.world.biome.BiomeType) (this.biomeById[(biomeId & 255)]));
    return biomeType == null ? org.spongepowered.api.world.biome.BiomeTypes.OCEAN : biomeType;
}