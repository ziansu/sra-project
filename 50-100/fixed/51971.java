public void registerHandlers() {
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.KeyInputHandler());
    halocraft.KeyBindings.init();
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.HaloGUIEventHandler(net.minecraft.client.Minecraft.getMinecraft()));
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.VehicleEventHandler());
    MinecraftForge.EVENT_BUS.register(new halocraft.handlers.HaloEventHandler());
}