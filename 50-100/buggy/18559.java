private boolean isValidBiomeName(java.lang.String biomeName) {
    net.minecraft.world.biome.BiomeGenBase[] allBiomes = net.minecraft.world.biome.BiomeGenBase.getBiomeGenArray();
    for (net.minecraft.world.biome.BiomeGenBase allBiome : allBiomes) {
        if ((allBiome != null) && (allBiome != (net.minecraft.world.biome.BiomeGenBase.hell))) {
            java.lang.String biomeNameI = allBiome.biomeName.toLowerCase();
            if (biomeNameI.equals(biomeName)) {
                return true;
            }
        }
    }
    return false;
}