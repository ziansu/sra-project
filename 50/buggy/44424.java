private static boolean canSpawnWitchHut(net.minecraft.world.biome.Biome b) {
    boolean canSpawn = false;
    if ((net.minecraftforge.common.BiomeDictionary.isBiomeOfType(b, BiomeDictionary.Type.WET)) && (net.minecraftforge.common.BiomeDictionary.isBiomeOfType(b, BiomeDictionary.Type.SWAMP))) {
        canSpawn = true;
    }
    return canSpawn;
}