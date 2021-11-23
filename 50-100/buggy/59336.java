@net.minecraftforge.fml.common.Mod.EventHandler
public void preInit(net.minecraftforge.fml.common.event.FMLPreInitializationEvent event) {
    com.needoriginalname.infinitygauntlet.hander.ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    com.needoriginalname.infinitygauntlet.hander.KeyBindingHandler.init();
    com.needoriginalname.infinitygauntlet.network.PacketHandler.registerPackets();
    com.needoriginalname.infinitygauntlet.InfinityQuantletMod.proxy.registerKeyBinding();
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new com.needoriginalname.infinitygauntlet.hander.KeyBindingHandler());
    com.needoriginalname.infinitygauntlet.InfinityQuantletMod.proxy.CreateAndRegisterHandlers();
    com.needoriginalname.infinitygauntlet.items.ModItems.preInit(event);
    com.needoriginalname.infinitygauntlet.blocks.ModBlocks.preInit(event);
}