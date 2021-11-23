public void fmlLifeCycleEvent(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    initConfig(event);
    registerBlocks();
    registerItems();
    registerTileEntities();
    registerModEntities();
    registerEntitySpawns();
    registerFuelHandlers();
    registerSimpleNetworking();
    registerDeconstructingPreInit(event);
}