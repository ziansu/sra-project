@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    sidben.villagertweaks.handler.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new sidben.villagertweaks.handler.ConfigurationHandler());
    sidben.villagertweaks.ModVillagerTweaks.NetworkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.ModChannel);
    sidben.villagertweaks.ModVillagerTweaks.NetworkWrapper.registerMessage(NetworkHelper.VillagerProfessionHandler.class, sidben.villagertweaks.network.MessageZombieVillagerProfession.class, 0, Side.CLIENT);
    sidben.villagertweaks.ModVillagerTweaks.NetworkWrapper.registerMessage(NetworkHelper.GolemEnchantmentHandler.class, sidben.villagertweaks.network.MessageGolemEnchantments.class, 1, Side.CLIENT);
}