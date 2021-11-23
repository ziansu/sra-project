public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.mcmoddev.modernmetals.util.Config.init();
    com.mcmoddev.modernmetals.proxy.Materials.init();
    com.mcmoddev.modernmetals.proxy.Fluids.init();
    com.mcmoddev.modernmetals.proxy.ItemGroups.init();
    com.mcmoddev.modernmetals.proxy.Blocks.init();
    com.mcmoddev.modernmetals.proxy.Items.init();
    com.mcmoddev.modernmetals.proxy.VillagerTrades.init();
    com.mcmoddev.modernmetals.proxy.ItemGroups.setupIcons();
    IntegrationManager.INSTANCE.preInit(event);
}