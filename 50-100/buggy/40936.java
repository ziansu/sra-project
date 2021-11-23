public static void postInit(net.minecraftforge.common.config.Configuration config) {
    config.addCustomCategoryComment("Mob Spawns", "Mobs use the \'Biome Type\' lists to populate their individual spawn settings the first time the game is loaded.\nChanging the type lists after this point has no effect UNLESS you also delete the mob spawn locations in the\nconfig - this will force them to re-populate the next time the game is loaded.\nAlternatively, you may add new biomes directly to the individual mob spawn entries and completely ignore biome type.");
    for (zeldaswordskills.util.BiomeType type : zeldaswordskills.util.BiomeType.values()) {
        zeldaswordskills.util.BiomeType.addBiomes(type, config.get("Mob Spawns", java.lang.String.format("[Biome Types] List of %s type biomes - certain mobs spawn differently depending on the biome type", type.toString()), type.defaultBiomes).getStringList());
    }
}