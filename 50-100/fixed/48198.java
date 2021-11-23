@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.LOWEST)
public void renderTick(final net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent event) {
    net.minecraft.client.multiplayer.WorldClient world = net.minecraft.client.Minecraft.getMinecraft().theWorld;
    if (((event.phase) == (net.minecraftforge.fml.common.gameevent.TickEvent.Phase.START)) && (world != null)) {
        net.minecraftforge.client.IRenderHandler weatherRenderer = world.provider.getWeatherRenderer();
        if (!(weatherRenderer instanceof org.blockartistry.mod.DynSurround.client.RenderWeather))
            world.provider.setWeatherRenderer(org.blockartistry.mod.DynSurround.client.RenderWeather.setParent(weatherRenderer));
        
    }
}