@java.lang.Override
protected void createBiomeProvider() {
    biomeProvider = new net.minecraft.world.biome.BiomeProviderSingle(de.errorcraftlp.sugarplus.Sugarplus.sugarBiome);
    setDimension(Sugarplus.SUGAR_DIMENSION_ID);
}