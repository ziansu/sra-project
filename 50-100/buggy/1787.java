private net.minecraft.world.biome.BiomeGenBase parseBiomeFromString(java.lang.String tmp) {
    for (net.minecraft.world.biome.BiomeGenBase biome : net.minecraft.world.biome.BiomeGenBase.getBiomeGenArray()) {
        if (biome.biomeName.replace(" ", "").equalsIgnoreCase(tmp)) {
            return biome;
        }
    }
    nil.xcompcraft.LogHelper.warn((("Provided biome name '" + tmp) + "' does not match any known biomes."));
    return null;
}