public void registerHandlers() {
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new halocraft.handlers.KeyInputHandler());
    halocraft.KeyBindings.init();
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.HaloGUIEventHandler(net.minecraft.client.Minecraft.getMinecraft()));
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.VehicleEventHandler());
    net.minecraftforge.fml.common.FMLCommonHandler.instance().bus().register(new halocraft.handlers.HaloEventHandler());
}