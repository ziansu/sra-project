@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void preBiomeDecorate(net.minecraftforge.event.terraingen.DecorateBiomeEvent.Pre event) {
    if (!(rtg.config.rtg.ConfigRTG.enableVillageModifications)) {
        return ;
    }
    if (((event.world.getWorldInfo().getTerrainType()) instanceof rtg.world.WorldTypeRTG) && ((event.world.getWorldChunkManager()) instanceof rtg.world.biome.WorldChunkManagerRTG)) {
        rtg.world.biome.WorldChunkManagerRTG cmr = ((rtg.world.biome.WorldChunkManagerRTG) (event.world.getWorldChunkManager()));
        this.biome = cmr.getBiomeDataAt(event.chunkX, event.chunkZ);
    }
}