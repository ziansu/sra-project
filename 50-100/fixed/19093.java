private boolean isDesertVillageBiome(net.minecraft.world.biome.BiomeGenBase biome) {
    if (biome == null)
        return false;
    
    if (((net.minecraftforge.common.BiomeDictionary.isBiomeOfType(biome, Type.HOT)) && (net.minecraftforge.common.BiomeDictionary.isBiomeOfType(biome, Type.DRY))) && (net.minecraftforge.common.BiomeDictionary.isBiomeOfType(biome, Type.SANDY))) {
        return true;
    }
    return false;
}