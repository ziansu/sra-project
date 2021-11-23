@java.lang.Override
public void registerEventHandlers() {
    MinecraftForge.EVENT_BUS.register(new ipsis.wini.handler.TextureEventHandlers());
    MinecraftForge.EVENT_BUS.register(new ipsis.wini.handler.ItemEventHandler());
    MinecraftForge.EVENT_BUS.register(new ipsis.wini.handler.LivingEventHandler());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new ipsis.wini.handler.PlayerEventHandler());
    cpw.mods.fml.common.FMLCommonHandler.instance().bus().register(new ipsis.wini.handler.LivingEventHandler());
}