@java.lang.Override
public void registerEvents() {
    MinecraftForge.EVENT_BUS.register(new com.minecolonies.coremod.event.EventHandler());
    MinecraftForge.EVENT_BUS.register(new com.minecolonies.coremod.event.FMLEventHandler());
}