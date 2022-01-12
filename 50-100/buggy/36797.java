@cpw.mods.fml.common.Mod.EventHandler
public void init(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(new com.miningmark48.miscconfigs.event.EventCraftingTable());
    MinecraftForge.EVENT_BUS.register(new com.miningmark48.miscconfigs.event.EventJoinGame());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new com.miningmark48.miscconfigs.event.EventNoRain());
    com.miningmark48.miscconfigs.utility.LogHelper.info(net.minecraft.util.StatCollector.translateToLocal("log.info.init"));
}