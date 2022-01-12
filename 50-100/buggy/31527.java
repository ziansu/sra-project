public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent e) {
    gerhard2202.culinaromancy.init.ModItems.init();
    gerhard2202.culinaromancy.init.ModItems.initModels();
    gerhard2202.culinaromancy.init.ModBlocks.init();
    gerhard2202.culinaromancy.init.ModBlocks.initModels();
    gerhard2202.culinaromancy.init.ModBlocks.initTileRenderers();
    gerhard2202.culinaromancy.init.Buffs.init();
    gerhard2202.culinaromancy.proxy.NetworkHandler.init();
    net.minecraftforge.fml.common.registry.GameRegistry.registerFuelHandler(new gerhard2202.culinaromancy.proxy.FuelHandler());
    gerhard2202.culinaromancy.proxy.FuelHandler.init();
    gerhard2202.culinaromancy.init.Entities.init();
    gerhard2202.culinaromancy.util.LogUtil.info("Culinaromancy preInit complete!");
}