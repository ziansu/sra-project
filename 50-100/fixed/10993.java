@java.lang.Override
public void setBiome(int x, int z, org.spongepowered.api.world.biome.BiomeType biome) {
    com.google.common.base.Preconditions.checkNotNull(biome, "biome");
    checkRange(x, z);
    this.biomes[((x - (this.start.getX())) + ((z - (this.start.getY())) * (this.size.getX())))] = ((net.minecraft.world.biome.BiomeGenBase) (biome));
}