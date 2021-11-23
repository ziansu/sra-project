public static com.google.common.collect.ImmutableList<net.minecraftforge.common.BiomeManager.BiomeEntry> getBiomes(net.minecraftforge.common.BiomeManager.BiomeType type) {
    int idx = type.ordinal();
    java.util.List<net.minecraftforge.common.BiomeManager.BiomeEntry> list = (idx >= (net.minecraftforge.common.BiomeManager.biomes.length)) ? null : net.minecraftforge.common.BiomeManager.biomes[idx];
    return list != null ? com.google.common.collect.ImmutableList.copyOf(list) : null;
}