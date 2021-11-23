@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void onGenerate(net.minecraftforge.event.terraingen.PopulateChunkEvent.Pre event) {
    if (chanceCubes.config.CCubesSettings.isBlockedWorld(event.world.getWorldInfo().getWorldName()))
        return ;
    
    if (chanceCubes.config.CCubesSettings.oreGeneration)
        generateOre(event.world, event.rand, ((event.chunkX) * 16), ((event.chunkZ) * 16));
    
    if (chanceCubes.config.CCubesSettings.surfaceGeneration)
        generateSurface(event.world, event.rand, ((event.chunkX) * 16), ((event.chunkZ) * 16));
    
}