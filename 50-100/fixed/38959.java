@cpw.mods.fml.common.Mod.EventHandler
public void init(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    TerraFirmaCraft.PACKET_PIPELINE.registerPacket(com.peffern.metals.InitClientWorldPacket.class);
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new com.peffern.metals.PlayerTracker());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new com.peffern.metals.ServerTickHandler());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new com.peffern.metals.CraftingHandler());
    MinecraftForge.EVENT_BUS.register(new com.peffern.metals.ChunkEventHandler());
}