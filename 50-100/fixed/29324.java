@java.lang.Override
public void registerEventHandlers() {
    MinecraftForge.EVENT_BUS.register(new ipsis.wini.handler.ItemEventHandler());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new ipsis.wini.handler.PlayerEventHandler());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new ipsis.wini.handler.LivingEventHandler());
}