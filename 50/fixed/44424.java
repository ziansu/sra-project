private static boolean canSpawnWitchHut(net.minecraft.world.biome.Biome b) {
    return (net.minecraftforge.common.BiomeDictionary.isBiomeOfType(b, BiomeDictionary.Type.WET)) && (net.minecraftforge.common.BiomeDictionary.isBiomeOfType(b, BiomeDictionary.Type.SWAMP));
}