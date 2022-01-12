@java.lang.Override
public void setBiome(int x, int z, org.spongepowered.api.world.biome.BiomeType biome) {
    checkOpen();
    checkRange(x, z);
    this.biomes[((x - (this.start.getX())) + ((z - (this.start.getY())) * (this.size.getX())))] = ((byte) (((net.minecraft.world.biome.BiomeGenBase) (biome)).biomeID));
}