public static void initialiseDimensionNames() {
    net.minecraft.world.WorldProvider provider = micdoodle8.mods.galacticraft.core.util.WorldUtil.getProviderForDimensionServer(0);
    micdoodle8.mods.galacticraft.core.util.WorldUtil.dimNames.put(ConfigManagerCore.idDimensionOverworld, new java.lang.String(provider.getDimensionName()));
}