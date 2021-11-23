@java.lang.Override
public org.bukkit.generator.ChunkGenerator getDefaultWorldGenerator(java.lang.String worldName, java.lang.String id) {
    return new com.worldcretornica.plotme.defaultgenerator.DefaultChunkGenerator(this, worldName.toLowerCase());
}