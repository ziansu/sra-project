@java.lang.Override
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent e) {
    super.preInit(e);
    OBJLoader.INSTANCE.addDomain(com.cjm721.overloaded.Overloaded.MODID);
    MinecraftForge.EVENT_BUS.register(new com.cjm721.overloaded.client.render.block.compressed.CompressedBlockAssets());
    com.cjm721.overloaded.common.block.ModBlocks.registerModels();
    com.cjm721.overloaded.common.item.ModItems.registerModels();
    CompressedResourcePack.INSTANCE.addDomain("overloaded");
    CompressedResourcePack.INSTANCE.inject();
}