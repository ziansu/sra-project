public static void postInit(net.minecraftforge.common.config.Configuration config) {
    for (zeldaswordskills.util.BiomeType type : zeldaswordskills.util.BiomeType.values()) {
        zeldaswordskills.util.BiomeType.addBiomes(type, config.get("Mob Spawns", java.lang.String.format("[Biome Types] List of %s type biomes - certain mobs spawn differently depending on the biome type", type.toString()), type.defaultBiomes).getStringList());
    }
}