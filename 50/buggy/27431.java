public void init(cpw.mods.fml.common.event.FMLInitializationEvent event) {
    MinecraftForge.EVENT_BUS.register(new ru.sarir.betterfood.handlers.BFCraftingHandler());
}